package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

	@Override
	public User findByUsername(String username) {

		User user = null;

		try {
			String sql = "select * from tab_user where username = ?";
			user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
		} catch (DataAccessException e) {
		//	e.printStackTrace();
		}

		return user;
	}

	@Override
	public void save(User user) {

		String sql = "insert into tab_user (`username`,`password`,`name`,`birthday`,sex,telephone,`email`,status,code)" +
				"values (?,?,?,?,?,?,?,?,?)";

		//执行sql
		template.update(sql, user.getUsername(), user.getPassword(),
				user.getName(), user.getBirthday(),
				user.getSex(), user.getTelephone(), user.getEmail(),
				user.getStatus(),user.getCode());
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {

		User user = null;

		String sql = "select * from tab_user where username = ? and password = ?";

		try {
			user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),
					username, password);
		} catch (DataAccessException e) {
		//	e.printStackTrace();
		}

		return user;
	}

	/**
	 * 根据激活码查询用户对象
	 * @param code
	 * @return
	 */
	@Override
	public User findByCode(String code) {

		String sql = "select * from tab_user where code = ?";

		User user = null;

		try {
			user = template.queryForObject(sql,
					new BeanPropertyRowMapper<>(User.class),
					code);
		} catch (DataAccessException e) {
		//	e.printStackTrace();
		}

		return user;
	}

	/**
	 * 修改指定用户的激活状态
	 * @param user
	 */
	@Override
	public void updateStatus(User user) {

		String sql = "update tab_user set status = 'Y' where uid = ?";

		template.update(sql, user.getUsername());

	}

}
