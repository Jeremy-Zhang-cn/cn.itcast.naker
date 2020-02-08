package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理测试类
public class ProxyTest {

	//真实对象
	private AccountDao dao = new AccountDaoImpl();

	//利用jdk自带的动态代理增强原对象功能
	@Test
	public void ProxyDemo() {


		AccountDao proxyDao = (AccountDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

			//	System.out.println(method.getName());
				System.out.println("前置增强...");
				Object invoke = method.invoke(dao,args);
				System.out.println("后置增强...");
				return invoke;
			}

		});

		proxyDao.add();
		proxyDao.del();

	}

}
