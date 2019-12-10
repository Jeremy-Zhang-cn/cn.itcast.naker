package com.itheima.mysql_day05.jdbcTemplate_demo;

import com.itheima.mysql_day05.util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplate_Demo_01 {

	private static JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

	public static void main(String[] args) {

	//	update();
	//	insert();
		delete();

	}

	//修改数据
	public static void update() {

		String sql = "update emp set salary = ? where id = ?";
		int count = template.update(sql, 11000, 1001);
		System.out.println(count);
	}

	//添加数据
	public static void insert() {
		String sql = "insert into emp (id,ename,dept_id) values (?, ?, ?)";
		int count = template.update(sql, 1025, "西门吹雪", 10);
		System.out.println(count);
	}

	//删除数据
	public static void delete() {
		String sql = "delete from emp where id = ?";
		int count = template.update(sql, 1025);
		System.out.println(count);
	}

}
