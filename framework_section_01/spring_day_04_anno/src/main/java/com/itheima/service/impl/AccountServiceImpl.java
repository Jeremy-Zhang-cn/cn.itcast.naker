package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Transactional
	@Override
	public void transfer(String srcName, String desName, Double money) {

		//转出
		accountDao.update(srcName, 0 - money);

	//	int i = 10 / 0;

		//转入
		accountDao.update(desName, 0 + money);

	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	@Override
	public List<Account> findAll() {

		return accountDao.findAll();

	}


}
