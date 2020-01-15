package dao;

import domain.User;

public interface UserDao {

	/**
	 * 查找用户信息
	 * @param user
	 * @return
	 */
	User findUser(User user);

}
