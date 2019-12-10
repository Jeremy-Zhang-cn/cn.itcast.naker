package com.itheima.mysql_day04.jdbc_demo_06;

import com.itheima.mysql_day04.domain.Emp;
import com.itheima.mysql_day04.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;

public class Demo_06 {

	/*
		使用工具类简化查询操作
	 */
	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//获取连接
			conn = JDBCUtils.getConnection();
			//定义sql语句
			String sql = "select * from emp";
			//获取sql语句执行对象
			stmt = conn.createStatement();
			//执行sql语句，获取结果集
			rs = stmt.executeQuery(sql);
			Emp emp;
			//处理结果集
			while (rs.next()) { //当rs游标下一个不为空时获取表中元素作为Emp对象的参数

				emp = new Emp();

				int id = rs.getInt("id");
				String ename = rs.getString("ename");
				int job_id = rs.getInt("job_id");
				int mgr = rs.getInt("mgr");
				Date joindate = rs.getDate("joindate");
				double salary = rs.getDouble("salary");
				double bonus = rs.getDouble("bonus");
				int dept_id = rs.getInt("dept_id");

				emp.setId(id);
				emp.setEname(ename);
				emp.setJob_id(job_id);
				emp.setMgr(mgr);
				emp.setJoindate(joindate);
				emp.setSalary(salary);
				emp.setBonus(bonus);
				emp.setDept_id(dept_id);

				list.add(emp);

			}

			for (Emp emp1 : list) {
				System.out.println(emp1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(stmt, conn, rs);
		}
	}
}
