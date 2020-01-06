package com.itheima.day_20.service.serviceImpl;

import com.itheima.day_20.dao.daoImpl.UserDaoImpl;
import com.itheima.day_20.domain.User;
import com.itheima.day_20.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User findUser(String username) {

		return new UserDaoImpl().findUserByUsername(username);

	}
}
