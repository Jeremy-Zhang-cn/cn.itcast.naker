package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {

	//转入
	void in(String name, Double money);

	//转出
	void out(String name, Double money);

	List<Account> findAll();


}
