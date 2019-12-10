package com.itheima.mysql_day05.jdbcTemplate_demo;

import com.itheima.mysql_day05.domain.Emp;
import com.itheima.mysql_day05.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplate_Demo_02 {

	/*
		JdbcTemplate执行DQL语句
	 */

	private static JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

	public static void main(String[] args) {

	//	test01();
	//	test02();
	//	test03();
		test04();

	}

	// 案例一： 将结果封装为Map集合, 该方法查询的结果集长度只能是1
	private static void test01() {

		String sql = "select * from emp where id = ?";
		Map<String, Object> map = template.queryForMap(sql, 1001);
		System.out.println(map);

	}

	//案例二： 将结果封装为List集合
	private static void test02() {

		String sql = "select * from emp";
		List<Map<String, Object>> list = template.queryForList(sql);
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}

	//案例三： 将结果封装为对象的List集合
	private static void test03() {

		String sql = "select * from emp";
		List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}


	//案例四： 将结果封装为对象，常用于聚合函数查询结果
	private static void test04() {

		String sql = "select count(id) from emp";
		Long total = template.queryForObject(sql, Long.class);
		System.out.println(total);

	}
}
