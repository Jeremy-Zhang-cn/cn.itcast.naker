package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

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

		//设置唯一激活码
		user.setCode(UuidUtil.getUuid());
		//设置激活状态status
		user.setStatus("N");
		//保存用户信息
		dao.save(user);
		//发送激活邮件
		String content = "<a href='http://localhost/travel/user/active?code="+user.getCode()+"'>点击激活帐号</a>";
		MailUtils.sendMail(user.getEmail(), content, "激活帐号");
		return true;
	}

	@Override
	public User login(User user) {
		return dao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

	/**
	 * 激活用户
	 * @param code
	 * @return
	 */
	@Override
	public boolean active(String code) {

		//根据激活码查询用户对象
		User user = dao.findByCode(code);

		if (user != null) {
			//调用dao的修改激活状态的方法
			dao.updateStatus(user);
			return true;
		} else {
			return false;
		}
	}


}
