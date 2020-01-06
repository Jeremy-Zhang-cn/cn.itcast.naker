package com.itheima.day_20.dao;

import com.itheima.day_20.domain.User;
import com.itheima.day_20.util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public interface UserDao {

	JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

	User findUserByUsername(String username);

}
