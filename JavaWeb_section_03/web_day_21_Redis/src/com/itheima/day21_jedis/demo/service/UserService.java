package com.itheima.day21_jedis.demo.service;

import com.itheima.day21_jedis.demo.domain.Province;

import java.util.List;

public interface UserService {

	List<Province> findAll();
	String findAllJson();

}
