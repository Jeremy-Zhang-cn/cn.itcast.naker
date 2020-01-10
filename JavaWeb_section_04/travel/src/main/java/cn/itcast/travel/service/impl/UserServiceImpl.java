package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao dao = new UserDaoImpl();

	@Override
	public boolean regist(User user) {

		//根据用户名查询用户对象
		User u = dao.findByUsername(user.getUsername());
		if (u != null) {
			//用户名存在，注册失败
			return false;
		}

		//保存用户信息
		dao.save(user);
		return true;
	}
}
