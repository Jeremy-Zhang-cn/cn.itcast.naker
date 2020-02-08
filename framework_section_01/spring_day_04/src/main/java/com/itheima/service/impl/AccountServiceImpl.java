package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;

	@Override
	public void transfer(String srcName, String desName, Double money) {

		//转出
		accountDao.out(srcName, money);

//		int i = 1 / 0;

		//转入
		accountDao.in(desName, money);

	}

	@Override
	public List<Account> findAll() {

		return accountDao.findAll();

	}

}
