package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {

	/**
	 * 用户管理的业务接口
	 */

	List<User> findAll();
	User login(User loginUser);
	void addUser(User user);

	User findUserById(int id);

	void updateUser(User user);

	//批量删除
	void delSelectedUser(String[] cbs);
}
