package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	@Override
	public List<User> list() {

		List<User> userList = userDao.findAll();
		//封装userList中的每一个User的roles数据

		for (User user : userList) {
			//获得user的id
			Long id = user.getId();
			//将id作为参数，查询当前userId对应的role集合数据
			List<Role> roles = roleDao.findRoleByUserId(id);

			user.setRoles(roles);
		}

		return userList;

	}

	@Override
	public void save(User user, Long[] roleIds) {

		//向sys_user表中存储数据
		Long userId = userDao.save(user);
		//向sus_user_role关系表中存储多条数据
		userDao.saveUserRoleRel(userId,roleIds);
	}

	@Override
	public void delete(Long userId) {


		//删除sys_user_role关系表
		userDao.deleteUserRoleRel(userId);

		//删除sys_user表
		userDao.delete(userId);
	}

}
