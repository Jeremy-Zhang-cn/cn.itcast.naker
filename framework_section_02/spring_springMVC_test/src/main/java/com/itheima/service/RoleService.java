package com.itheima.service;

import com.itheima.domain.Role;

import java.util.List;

public interface RoleService {

	List<Role> list();

	void save(Role role);

	void delete(Integer id);
}
