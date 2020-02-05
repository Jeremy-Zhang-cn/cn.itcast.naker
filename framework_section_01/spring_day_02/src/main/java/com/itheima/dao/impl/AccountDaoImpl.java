package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component("accountDao")
@Repository
public class AccountDaoImpl implements AccountDao {

//	@Resource(name = "jdbcTemplate")  //相当于@Autowired + @Qualifier
	@Autowired	//1.按照类型进行依赖注入； 2. 如果在spring中找到了多个符合条件的对象，则Autowired会根据变量的名字自己匹配一个
	@Qualifier("jdbcTemplate")
	private JdbcTemplate template;

	/*
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	*/

	@Override
	public List<Account> findAll() {

		String sql = " SELECT * FROM account ";

		return template.query(sql,
				new BeanPropertyRowMapper<>(Account.class)
		);

	}

}
