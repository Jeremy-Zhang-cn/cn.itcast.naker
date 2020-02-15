package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

	List<User> findAll();

	List<User> findByName(String name);

	void add(User user);

	void deleteById(Integer id);

	void updateById(User user);


}
