package com.itheima.mysql_day04.jdbc_demo_08;

import com.itheima.mysql_day04.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo_08 {

	/*
		事务的应用
			利用事务完成转账操作
	 */
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;

		try {
			//获取连接对象
			conn = JDBCUtils.getConnection();
			//开启事务
			conn.setAutoCommit(false);
			//定义sql语句
			String sql1 = "update account set balance = balance - ? where id = 1";
			String sql2 = "update account set balance = balance + ? where id = 2";

			//获取sql语句执行对象
			pstmt1 = conn.prepareStatement(sql1);
			pstmt2 = conn.prepareStatement(sql2);

			//为占位符赋值
			pstmt1.setDouble(1,500);
			pstmt2.setDouble(1, 500);

			//执行sql语句
			int i = pstmt1.executeUpdate();
			int j = pstmt2.executeUpdate();
			//提交事务
			conn.commit();
		} catch (SQLException e) {

			if (conn != null) {
				try {
					//回滚事务
					conn.rollback();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			e.printStackTrace();
		} finally {
			//释放资源
			JDBCUtils.close(pstmt1,conn,null);
			JDBCUtils.close(pstmt2,null,null);
		}
	}
}
