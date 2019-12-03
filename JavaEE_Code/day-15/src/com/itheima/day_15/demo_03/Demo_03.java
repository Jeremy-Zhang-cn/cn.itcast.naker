package com.itheima.day_15.demo_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo_03 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

		//获取Class对象
		Class<?> c = Class.forName("com.itheima.day_15.demo_02.Student");

		Constructor<?> con 	= c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);

		Field nameField = c.getDeclaredField("name");
		//暴力反射
		nameField.setAccessible(true);
		nameField.set(obj, "张三");
		//获取字段的值
		Object name = nameField.get(obj);

		System.out.println(name);

		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 23);
		Object age = ageField.get(obj);
		System.out.println(age);

	}
}
