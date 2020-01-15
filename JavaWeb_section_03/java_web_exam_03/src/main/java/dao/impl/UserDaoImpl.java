package dao.impl;

import dao.UserDao;
import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.DruidUtils;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());

	@Override
	public User findUser(User user) {

		String sql = "select * from `tab_user` where `username` = ? and `password` = ? ";

		User u = null;

		try {
			u = template.queryForObject(sql,
					new BeanPropertyRowMapper<>(User.class),
					user.getUsername(),
					user.getPassword()
			);
		} catch (DataAccessException e) {
		//	e.printStackTrace();
		}

		return u;


	}

}
