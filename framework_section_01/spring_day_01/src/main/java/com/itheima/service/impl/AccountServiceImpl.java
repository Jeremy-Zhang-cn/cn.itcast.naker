package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> findAll() {
		return accountDao.findAll();
	}
}
