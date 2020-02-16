package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {

	void add(User user);

	List<User> findAll();

	User findOne(User user);

	List<User> findByIds(List<Integer> ids);

	List<User> findByConditions(User user);

	List<User> findLikeName(String name);



}
