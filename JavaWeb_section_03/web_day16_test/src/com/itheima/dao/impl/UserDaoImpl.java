package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.PageBean;
import com.itheima.domain.User;
import com.itheima.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {

	//获取JdbcTemplate对象
	private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

	@Override
	public List<User> findAll() {

		//定义sql语句
		String sql = "select * from `user`";
		//执行查询操作，返回List<User>对象
		return template.query(sql, new BeanPropertyRowMapper<>(User.class));

	}

	@Override
	public User findUserAndPassword(User loginUser) {

		String sql = "select * from `user` where username = ? and password = ?";

		try {
			//查询表中是否存在此用户名和密码，若存在返回User对象
			return template.queryForObject(sql,
					new BeanPropertyRowMapper<>(User.class),
					loginUser.getUsername(),
					loginUser.getPassword());
		} catch (DataAccessException e) {
			//若不存在，返回空值
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void addUser(User user) {

		String sql = "insert into `user`(`name`,gender,age,address,qq,`email`) values (?,?,?,?,?,?)";

		//使用JdbcTemplate插入数据
		int update = template.update(sql,
				user.getName(),
				user.getGender(),
				user.getAge(),
				user.getAddress(),
				user.getQq(),
				user.getEmail()
		);
	}

	//删除指定单个条目
	@Override
	public void delSingleUserById(int id) {

		String sql = "delete from `user` where id = ?";

		template.update(sql, id);

	}

	//查询单个用户
	@Override
	public User findUserById(int id) {

		String sql = "select * from `user` where id = ?";

		return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);

	}

	@Override
	public void updateUser(User user) {
		String sql = "update `user` set gender = ?, age = ?, address = ?, qq = ?, email = ? where id = ?";

		template.update(sql,
				user.getGender(),
				user.getAge(),
				user.getAddress(),
				user.getQq(),
				user.getEmail(),
				user.getId());
	}

	@Override
	public void delSelectedUser(int id) {

		String sql = "delete from `user` where id = ?";

		template.update(sql, id);

	}

	@Override
	public int findTotalCount(Map<String, String[]> condition) {

		//定义模板初始化sql
		String sql = "select count(*) from `user` where 1 = 1";
		StringBuilder sb = new StringBuilder(sql);
		//遍历map
		Set<String> keySet = condition.keySet();
		//定义参数的集合
		List<Object> params = new ArrayList<>();

		for (String key : keySet) {

			//排除分页条件参数
			if ("currentPage".equals(key) || "rows".equals(key)) {
				continue;
			}

			String value = condition.get(key)[0];

			if (value != null && !("".equals(value))) {
				sb.append(" and ").append(key).append(" like ? ");
				params.add("%" + value + "%"); //添加?条件的值
			}
		}

		System.out.println(sb.toString());
		System.out.println(params);

		return template.queryForObject(sb.toString(), Integer.class, params.toArray());
	}

	@Override
	public List<User> findByPage(int start, int rows, Map<String, String[]> condition) {

		String sql = "select * from `user` where 1 = 1";

		StringBuilder sb = new StringBuilder(sql);
		//遍历map
		Set<String> keySet = condition.keySet();
		//定义参数的集合
		List<Object> params = new ArrayList<>();

		for (String key : keySet) {

			//排除分页条件参数
			if ("currentPage".equals(key) || "rows".equals(key)) {
				continue;
			}

			String value = condition.get(key)[0];

			if (value != null && !("".equals(value))) {
				sb.append(" and ").append(key).append(" like ? ");
				params.add("%" + value + "%"); //添加?条件的值
			}
		}

		//添加分页查询
		sb.append(" limit ?, ? ");
		//添加分页参数值
		params.add(start);
		params.add(rows);

		return template.query(sb.toString(),
				new BeanPropertyRowMapper<User>(User.class),
				params.toArray());
	}

	@Override
	public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {

		//创建空的PageBean对象
		PageBean<User> pb = new PageBean<>();
		int currentPage = Integer.parseInt(_currentPage);
		int rows = Integer.parseInt(_rows);

		if (currentPage <= 0) {
			currentPage = 1;
		}

		//设置参数
		pb.setCurrentPage(currentPage);
		pb.setRows(rows);

		//调用DAO查询总记录数
		int totalCount = new UserDaoImpl().findTotalCount(condition);
		pb.setTotalCount(totalCount);

		//调用DAO查询list集合
		//计算开始的记录索引
		int start = (currentPage - 1) * rows;
		List<User> list = new UserDaoImpl().findByPage(start, rows, condition);
		pb.setList(list);

		//计算总页码
		int totalPage = (totalCount % rows) == 0 ? totalCount / rows : ((totalCount / rows) + 1);

		if (currentPage > totalPage) {
			currentPage --;
		}

		pb.setTotalPage(totalPage);
		pb.setCurrentPage(currentPage);


		return pb;
	}
}
