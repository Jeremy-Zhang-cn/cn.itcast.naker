package com.itheima.service.impl;

import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.PageBean;
import com.itheima.domain.User;
import com.itheima.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {

		//调用DAO完成查询
		return new UserDaoImpl().findAll();

	}

	@Override
	public User login(User loginUser) {

		return new UserDaoImpl().findUserAndPassword(loginUser);

	}

	//调用DAO完成添加用户
	@Override
	public void addUser(User user) {

		new UserDaoImpl().addUser(user);

	}

	//查询单个用户信息
	@Override
	public User findUserById(int id) {
		return new UserDaoImpl().findUserById(id);
	}

	//调用DAO删除单个用户

	public void delSingleUser(int id) {
		new UserDaoImpl().delSingleUserById(id);
	}

	@Override
	public void updateUser(User user) {
		new UserDaoImpl().updateUser(user);
	}

	@Override
	public void delSelectedUser(String[] cbs) {

		UserDaoImpl userDao = new UserDaoImpl();

		for (String cb : cbs) {
			//调用dao删除
			int id = Integer.parseInt(cb);
			userDao.delSelectedUser(id);
		}
	}

	@Override
	public PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition) {
		return new UserDaoImpl().findUserByPage(currentPage, rows, condition);
	}
}
