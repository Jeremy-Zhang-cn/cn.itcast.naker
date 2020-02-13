package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

	User login(String username, String password);

	List<User> findAll();

}
