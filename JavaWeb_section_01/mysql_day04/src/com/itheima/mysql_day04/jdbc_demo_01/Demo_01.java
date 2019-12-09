package com.itheima.mysql_day04.jdbc_demo_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo_01 {

	public static void main(String[] args) throws Exception {
		//1.导入驱动jar包
		//2.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//3. 获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb_db02", "root", "dingjie0822");
		//4. 定义sql语句
		String sql = "update salarygrade set losalary = 30000 where grade = 5";
		//5. 获取执行sql的对象 Statement
		Statement stmt = conn.createStatement();
		//6. 执行sql
		int i = stmt.executeUpdate(sql);
		//7. 处理结果
		System.out.println(i);
		//8. 释放资源
		stmt.close();
		conn.close();
	}
}
