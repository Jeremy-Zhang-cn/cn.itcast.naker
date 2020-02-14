package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public List<User> findAll() {

		String sql = "select * from sys_user";

		return template.query(
				sql,
				new BeanPropertyRowMapper<>(User.class)
		);
	}

	@Override
	public Long save(User user) {

		//创建PreparedStatementCreator
		PreparedStatementCreator creator = new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				//使用原始jdbc完成有个PreparedStatement的组建
				PreparedStatement preparedStatement = connection.prepareStatement("insert into sys_user values(?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
				preparedStatement.setObject(1,null);
				preparedStatement.setString(2,user.getUsername());
				preparedStatement.setString(3,user.getEmail());
				preparedStatement.setString(4,user.getPassword());
				preparedStatement.setString(5,user.getPhoneNum());
				return preparedStatement;
			}
		};
		//创建keyHolder
		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
		template.update(creator,keyHolder);
		//获得生成的主键
		long userId = keyHolder.getKey().longValue();
		return userId; //返回当前保存用户的id 该id是数据库自动生成的
	}

	@Override
	public void saveUserRoleRel(Long userId, Long[] roleIds) {

		for (Long roleId : roleIds) {
			template.update("insert into sys_user_role values(?,?)",userId,roleId);
		}

	}

	@Override
	public void deleteUserRoleRel(Long userId) {

		String sql = "delete from sys_user_role where userId = ?";

		template.update(
				sql,
				userId
				);
	}

	@Override
	public void delete(Long userId) {

		String sql = "delete from sys_user where id = ?";

		template.update(
				sql,
				userId
		);

	}
}
