package com.itheima.dao.impl;

import com.itheima.dao.RoleDao;
import com.itheima.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Role> findAll() {

		String sql = "select * from sys_role";

		return template.query(
				sql,
				new BeanPropertyRowMapper<>(Role.class)
		);

	}

	@Override
	public void save(Role role) {

		String sql = "insert into sys_role values(?, ?, ?)";
		template.update(sql, null, role.getRoleName(), role.getRoleDesc());

	}

	/**
	 * 删除用户和角色的对应关系
	 *
	 * @param id
	 */
	@Override
	public void deleteUserRoleById(Integer id) {

		String sql = "delete  from sys_user_role where roleId = ?";

		template.update(sql, id);
	}

	/**
	 * 删除角色信息
	 *
	 * @param id
	 */
	@Override
	public void deleteRoleById(Integer id) {

		String sql = "delete  from sys_role where id = ?";

		template.update(sql, id);

	}

	@Override
	public List<Role> findRoleByUserId(Long id) {

		String sql = "select * from sys_user_role ur, sys_role r where ur.roleId = r.id and ur.userId = ?";

		return template.query(
				sql,
				new BeanPropertyRowMapper<>(Role.class),
				id
		);
	}
}
