package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public User login(String username, String password) {

		String sql = "select * from user where username = ? and password = ?";

		User user = null;

		try {
			user = template.queryForObject(
					sql,
					new BeanPropertyRowMapper<>(User.class),
					username,
					password);
		} catch (DataAccessException e) {
		//	e.printStackTrace();
		}

		return user;
	}

	@Override
	public List<User> findAll() {

		String sql = "select * from user";

		return template.query(sql,new BeanPropertyRowMapper<>(User.class));

	}
}
