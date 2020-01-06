package com.itheima.day_20.service;

import com.itheima.day_20.domain.User;

public interface UserService {

	//根据用户名查找用户
	User findUser(String username);

}
