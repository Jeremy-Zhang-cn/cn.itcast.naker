package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {

	//转账
	void transfer(String srcName, String desName, Double money);

	//查询所有信息
	List<Account> findAll();

}
