package com.itheima.day21_jedis.demo.dao;

import com.itheima.day21_jedis.demo.domain.Province;

import java.util.List;

public interface ProvinceDao {

	List<Province> findAll();
	String findAllJson();

}
