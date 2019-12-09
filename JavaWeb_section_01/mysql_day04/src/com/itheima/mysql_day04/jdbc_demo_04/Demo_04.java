package com.itheima.mysql_day04.jdbc_demo_04;

import com.itheima.mysql_day04.util.JDBCUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_04 {

	/*
		删除数据
	 */
	public static void main(String[] args) {

		Statement stmt = null;
		Connection conn = null;
		try {
			//1. 注册驱动
			//2. 获取连接对象
			conn = JDBCUtils.getConnection();
			//3. 创建sql语句
			String sql = "delete from account where id = 3";
			//4. 获取sql语句执行对象
			stmt = conn.createStatement();
			//5. 执行sql语句
			int row = stmt.executeUpdate(sql);
			System.out.println(row);
			if (row > 0) {
				System.out.println("删除数据成功");
			} else {
				System.out.println("删除数据失败");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(stmt, conn, null);
		}
	}
}
