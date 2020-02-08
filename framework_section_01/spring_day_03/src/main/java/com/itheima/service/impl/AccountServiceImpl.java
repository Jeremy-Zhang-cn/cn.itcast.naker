package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public void add() {
		accountDao.add();
	}

	@Override
	public void del() {
		accountDao.del();
	}

	@Override
	public void upd() {
		accountDao.upd();
	}

	@Override
	public void find() {
		accountDao.find();
	}

}
