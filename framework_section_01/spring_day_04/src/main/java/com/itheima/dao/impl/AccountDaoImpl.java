package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public void in(String name, Double money) {

		String sql = "update Account set money = (money + ?) where name = ?";

		template.update(sql, money, name);

	}

	@Override
	public void out(String name, Double money) {

		String sql = "update Account set money = (money - ?) where name = ?";

		template.update(sql, money, name);

	}

	@Override
	public List<Account> findAll() {

		String sql = "select * from Account";


		return template.query(sql, new BeanPropertyRowMapper<>(Account.class));

	}

}
