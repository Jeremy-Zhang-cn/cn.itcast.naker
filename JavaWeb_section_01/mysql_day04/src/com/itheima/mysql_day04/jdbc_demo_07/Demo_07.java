package com.itheima.mysql_day04.jdbc_demo_07;

import com.itheima.mysql_day04.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class Demo_07 {

	/*
		用户登录验证案例
			使用PreparedStatement来避免SQL注入问题
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		boolean flag = login(username, password);
		if (flag) {
			System.out.println("登陆成功");
		} else {
			System.out.println("用户名或密码错误");
		}
	}

	public static boolean login(String username, String password) {

		if (username == null || password == null) {
			return false;
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			//获取连接
			conn = JDBCUtils.getConnection();
			//定义sql语句，使用占位符?
			String sql = "select * from user where username = ? and password = ?";
			//获取sql语句执行对象
			pstmt = conn.prepareStatement(sql);
			//为占位符赋值
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			//执行语句，获取结果集
			rs = pstmt.executeQuery();
			//处理结果集
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//释放资源
			JDBCUtils.close(pstmt, conn, rs);  //PreparedStatement调用父接口Statement中的close()方法
		}
		return false;
	}
}
