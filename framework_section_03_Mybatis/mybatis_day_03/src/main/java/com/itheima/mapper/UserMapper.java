package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {

	List<User> listAll();

	User getById(Long id);

}
