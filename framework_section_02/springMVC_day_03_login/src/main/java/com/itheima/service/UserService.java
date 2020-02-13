package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {

	User login(String username, String password);

	List<User> findAll();

}
