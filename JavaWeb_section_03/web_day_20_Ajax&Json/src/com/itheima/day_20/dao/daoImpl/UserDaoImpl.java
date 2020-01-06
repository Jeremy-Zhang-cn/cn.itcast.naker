package com.itheima.day_20.dao.daoImpl;

import com.itheima.day_20.dao.UserDao;
import com.itheima.day_20.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class UserDaoImpl implements UserDao {

	@Override
	public User findUserByUsername(String username) {

		String sql = "select * from `user` where username = ?";
		return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);

	}


}
