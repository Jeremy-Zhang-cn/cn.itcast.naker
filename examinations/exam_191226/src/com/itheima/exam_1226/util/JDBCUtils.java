package com.itheima.exam_1226.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.exam_1226.demo_01.Demo_01;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {

	/*
		数据库连接池工具类
	 */
	private static DataSource ds;

	private JDBCUtils() {
	}

	//静态代码块用来加载连接池配置文件并获取连接池对象
	static {
		Properties pro = new Properties();
		try {
			//加载配置文件
			pro.load(Demo_01.class.getClassLoader().getResourceAsStream("druid.properties"));
			//获取连接池对象
			ds = DruidDataSourceFactory.createDataSource(pro);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//返回连接池对象
	public static DataSource getDatasource() {
		return ds;
	}

	//返回Connection对象
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
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
