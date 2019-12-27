package com.itheima.exam_1226.demo_01;

import com.itheima.exam_1226.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo_01 {

	public static void main(String[] args) {

		//获取连接
		try {
			Connection connection = JDBCUtils.getConnection();
			String sql = "UPDATE \n" +
					"\t`emp` t1,\n" +
					"\t(SELECT YEAR(FROM_DAYS(DATEDIFF(NOW(),emp.hiredate))) years FROM `emp`) t2\n" +
					"SET\n" +
					"\tt1.sal=t1.sal*1.1\n" +
					"WHERE\n" +
					"\tt2.years>35;";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.executeUpdate();
			JDBCUtils.close(pstmt,connection,null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
