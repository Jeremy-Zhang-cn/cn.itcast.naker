package test;

import dao.UserDao;
import domain.User;
import org.junit.Test;

public class TestDemo {

	@Test
	public void loginTest() {

		User user = new User("zhangsan","123456");
		UserDao dao = new UserDao();
		User login = dao.login(user);
		System.out.println(login);

	}

}
