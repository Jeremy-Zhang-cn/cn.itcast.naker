package com.itheima.dao;

import com.itheima.domain.PageBean;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

	/**
	 * 用户操作的DAO
	 */

	List<User> findAll();

	User findUserAndPassword(User loginUser);

	void addUser(User user);

	void delSingleUserById(int id);

	User findUserById(int id);

	void updateUser(User user);

	void delSelectedUser(int id);

	PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition);

	//分页查询每一页的记录
	List<User> findByPage(int start, int rows, Map<String, String[]> condition);

	//查询总记录数
	int findTotalCount(Map<String, String[]> condition);
}
