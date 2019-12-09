package com.itheima.mysql_day04.jdbc_demo_05;

import com.itheima.mysql_day04.util.JDBCUtils;

import java.sql.*;

public class Demo_05 {

	/*
		使用ResultSet获取数据
	 */
	public static void main(String[] args) {

		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;

		try {
			//1. 注册驱动
			//2. 获取连接对象
			conn = JDBCUtils.getConnection();
			//3. 创建sql语句
			String sql = "select * from account";
			//4. 获取sql语句执行对象
			stmt = conn.createStatement();
			//5. 执行sql语句
			rs = stmt.executeQuery(sql);
			//6. 处理结果集
			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				double balance = rs.getDouble("balance");

				System.out.println(id + ", " + name + ", " + balance);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//7. 释放资源
			JDBCUtils.close(stmt, conn, rs);

		}
	}
}
