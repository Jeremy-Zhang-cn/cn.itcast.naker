package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

	/**
	 * 用户操作的DAO
	 */

	List<User> findAll();

	User findUserAndPassword(User loginUser);

	void addUser(User user);

	void delSingleUserById(int id);

	User findUserById(int id);

	void updateUser(User user);

	void delSelectedUser(int id);
}
