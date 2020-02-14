package com.itheima.dao;

import com.itheima.domain.Role;

import java.util.List;

public interface RoleDao {

	/**
	 * 查询所有角色(Role)信息
	 * @return
	 */
	List<Role> findAll();

	void save(Role role);

	void deleteUserRoleById(Integer id);

	void deleteRoleById(Integer id);

	List<Role> findRoleByUserId(Long id);

}
