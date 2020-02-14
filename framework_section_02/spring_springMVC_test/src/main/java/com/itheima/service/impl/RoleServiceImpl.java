package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.domain.Role;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public List<Role> list() {
		return roleDao.findAll();
	}

	@Override
	public void save(Role role) {

		roleDao.save(role);

	}


	@Override
	public void delete(Integer id) {

		//删除表与表之间的关联关系
		roleDao.deleteUserRoleById(id);
		//删除role表中的数据
		roleDao.deleteRoleById(id);

	}
}
