package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

	//获取JdbcTemplate对象
	private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

	@Override
	public List<User> findAll() {

		//定义sql语句
		String sql = "select * from `user`";
		//执行查询操作，返回List<User>对象
		return template.query(sql, new BeanPropertyRowMapper<>(User.class));

	}

	@Override
	public User findUserAndPassword(User loginUser) {

		String sql = "select * from `user` where username = ? and password = ?";

		try {
			//查询表中是否存在此用户名和密码，若存在返回User对象
			return template.queryForObject(sql,
					new BeanPropertyRowMapper<>(User.class),
					loginUser.getUsername(),
					loginUser.getPassword());
		} catch (DataAccessException e) {
			//若不存在，返回空值
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void addUser(User user) {

		String sql = "insert into `user`(`name`,gender,age,address,qq,`email`) values (?,?,?,?,?,?)";

		//使用JdbcTemplate插入数据
		int update = template.update(sql,
				user.getName(),
				user.getGender(),
				user.getAge(),
				user.getAddress(),
				user.getQq(),
				user.getEmail()
		);
	}

	//删除指定单个条目
	@Override
	public void delSingleUserById(int id) {

		String sql = "delete from `user` where id = ?";

		template.update(sql, id);

	}

	//查询单个用户
	@Override
	public User findUserById(int id) {

		String sql = "select * from `user` where id = ?";

		return template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);

	}

	@Override
	public void updateUser(User user) {
		String sql = "update `user` set gender = ?, age = ?, address = ?, qq = ?, email = ? where id = ?";

		template.update(sql,
				user.getGender(),
				user.getAge(),
				user.getAddress(),
				user.getQq(),
				user.getEmail(),
				user.getId());
	}

	@Override
	public void delSelectedUser(int id) {

		String sql = "delete from `user` where id = ?";

		template.update(sql,id);

	}
}
