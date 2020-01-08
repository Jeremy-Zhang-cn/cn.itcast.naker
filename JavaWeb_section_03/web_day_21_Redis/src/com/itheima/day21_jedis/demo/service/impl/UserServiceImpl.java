package com.itheima.day21_jedis.demo.service.impl;

import com.itheima.day21_jedis.demo.dao.ProvinceDao;
import com.itheima.day21_jedis.demo.dao.impl.ProvinceDaoImpl;
import com.itheima.day21_jedis.demo.domain.Province;
import com.itheima.day21_jedis.demo.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

	private ProvinceDao dao = new ProvinceDaoImpl();

	@Override
	public List<Province> findAll() {
		return dao.findAll();
	}

	@Override
	public String findAllJson() {

		return dao.findAllJson();

	}

}
