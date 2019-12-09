package com.itheima.mysql_day04.jdbc_demo_06;

import com.itheima.mysql_day04.domain.Emp;
import com.itheima.mysql_day04.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;

public class Demo_06 {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<>();
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConnection();
		try {

			stmt = conn.createStatement();
			String sql = "select * from emp";
			rs = stmt.executeQuery(sql);
			Emp emp;

			while (rs.next()) {

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
