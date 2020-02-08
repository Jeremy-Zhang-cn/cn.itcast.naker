package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {

	void update(String name, Double money);


	List<Account> findAll();
}
