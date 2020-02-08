package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component("accountService")
@Service  //如果在这里不加名字的话，默认id是类名，首字母小写("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

/*

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
*/

	@Override
	public List<Account> findAll() {

		return accountDao.findAll();

	}

	public void add() {
		accountDao.add();
	}

}
