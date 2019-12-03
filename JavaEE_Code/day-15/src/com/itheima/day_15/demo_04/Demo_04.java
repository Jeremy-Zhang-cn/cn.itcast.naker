package com.itheima.day_15.demo_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo_04 {

	/*
		反射获取成员方法并使用
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		//获取Class对象
		Class<?> c = Class.forName("com.itheima.day_15.demo_02.Student");

		Constructor<?> con = c.getConstructor();

		Object obj = con.newInstance();

		//Method[] getMethods() 返回一个包含 方法对象的数组， 方法对象反映由该 Class对象表示的类或接口的所有公共方法，包括由类或接口声明的对象以及从超类和超级接口继承的类
		//Method[] getDeclaredMethods() 返回一个包含 方法对象的数组， 方法对象反映由 Class对象表示的类或接口的所有声明方法，包括public，protected，default（package）访问和私有方法，但不包括继承方法

		Method m = c.getMethod("method1");	//获取公共的方法
		m.invoke(obj);

		Method m2 = c.getMethod("method2", String.class, int.class);
		Object o = m2.invoke(obj, "张三", 23);
		System.out.println(o);

		Method f = c.getDeclaredMethod("function");	//获取私有的方法
		f.setAccessible(true);	//设置取消访问检查
		f.invoke(obj);

	}


}
