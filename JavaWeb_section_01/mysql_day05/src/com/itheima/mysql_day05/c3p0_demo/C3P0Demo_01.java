package com.itheima.mysql_day05.c3p0_demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo_01 {

	public static void main(String[] args) {
		//获取DataSource，使用默认配置
		DataSource ds = new ComboPooledDataSource();
		//获取DataSource，使用指定名称的配置
	//	DataSource ds = new ComboPooledDataSource("otherc3p0");

		Connection conn = null;
		try {
			//从连接池中获取连接
			conn = ds.getConnection();
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
