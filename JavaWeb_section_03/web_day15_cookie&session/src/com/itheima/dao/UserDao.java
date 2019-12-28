package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.util.JDBCUtils;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserDao {

	private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

	public User login(User loginUser) {

		try {

			String sql = "select * from user where username = ? and password = ?";

			//使用template的queryForObject方法查询数据信息，并将结果封装为User对象然后返回
			return template.queryForObject(sql,
					new BeanPropertyRowMapper<>(User.class),
					loginUser.getUsername(),loginUser.getPassword());

		} catch (DataAccessException e) {
			e.printStackTrace();
			return null;
		}

	}

}
