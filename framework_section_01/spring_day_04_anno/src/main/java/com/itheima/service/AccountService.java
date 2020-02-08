package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {

	void transfer(String srcName, String desName, Double money);

	List<Account> findAll();

}
