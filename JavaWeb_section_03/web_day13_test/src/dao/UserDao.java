package dao;

import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class UserDao {

	private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

	public User login(User loginUser) {

		try {

			String sql = "select * from user where username = ? and password = ?";

			return template.queryForObject(sql,
					new BeanPropertyRowMapper<>(User.class),
					loginUser.getUsername(),loginUser.getPassword());

		} catch (DataAccessException e) {
			e.printStackTrace();
			return null;
		}

	}

}
