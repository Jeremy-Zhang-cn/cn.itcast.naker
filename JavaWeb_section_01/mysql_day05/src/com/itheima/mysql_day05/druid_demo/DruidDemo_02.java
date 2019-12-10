package com.itheima.mysql_day05.druid_demo;

import com.itheima.mysql_day05.util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;


public class DruidDemo_02 {

	public static void main(String[] args) {

		//1. 导入jar包
		//2. 创建JdbcTemplate对象
		JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

		//3. 调用方法
	//	String sql = "update account set balance = ? where id = ?";
	//	int count = template.update(sql, 3000, 1);

	//	int update = template.update("insert into account (`name`,balance) values ('王五',2000)");
		int count = template.update("update account set balance = ? where id = ?", 3000, 1);

		System.out.println(count);
	}
}
