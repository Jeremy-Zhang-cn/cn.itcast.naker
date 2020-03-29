package com.itheima.userservice.service;

import com.itheima.userservice.mapper.UserMapper;
import com.itheima.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 根据主键查询用户
	 */
	public User queryById(Long id) {
		return userMapper.selectById(id);
	}
}
