package com.itheima.mysql_day04.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {

	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	private static Connection conn;

	static {

		try {
			//创建Properties集合对象
			Properties pro = new Properties();
			//使用类加载器，读取src下的配置文件信息
			InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			pro.load(is);
			driverClass = pro.getProperty("driverClass");
			//注册驱动
			Class.forName(driverClass);
			url = pro.getProperty("url");
			username = pro.getProperty("username");
			password = pro.getProperty("password");
			//获取连接
			conn = DriverManager.getConnection(url, username, password);

		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private JDBCUtils() {
	}

	public static Connection getConnection() {	//返回连接对象
		return conn;
	}

	//释放资源
	public static void close(Statement stmt, Connection conn, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
