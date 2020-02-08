package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Override
	public void add() {
	//	int i = 1 / 0;
		System.out.println("add...");
	}

	@Override
	public void del() {
		System.out.println("del...");
	}

	@Override
	public void upd() {
		System.out.println("upd...");
	}

	@Override
	public void find() {
		System.out.println("find...");
	}

}
