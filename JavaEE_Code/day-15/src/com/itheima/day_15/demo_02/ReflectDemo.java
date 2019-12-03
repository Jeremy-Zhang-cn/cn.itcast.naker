package com.itheima.day_15.demo_02;

import java.lang.reflect.Field;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

		//获取Class对象
		Class<?> c = Class.forName("com.itheima.day_15.demo_02.Student");

		//Field[] getField()返回一个包含Field对象的数组，Field对象反映由该Class对象表示的类活接口的所有可访问的公共字段
		//Field[] getDeclaredField()返回一个包含Field对象的数组，Field对象反映由该Class对象表示的类活接口的所有字段，包括非公共字段

	//	Field[] fields = c.getFields();
		Field[] fields = c.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field);
		}

		System.out.println("~~~~~~~~~~~~");

		//Field getField?(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定公共成员字段
		//Field getDeclaredField?(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定声明字段
		Field ageField = c.getField("age");
		// Field addressField = c.getField("name");

		//获取无参构造方法创建对象
		// Constructor<?> con = c.getConstructor();
		// Object obj = con.newInstance();

		Object obj = c.newInstance();

		//Field提供有关类或接口的单个字段的信息和动态访问
		//void set?(Object obj, Object value) 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值
		ageField.set(obj,23); //给obj的成员变量ageField赋值为23
		System.out.println(ageField.get(obj));
		System.out.println(obj);


	}
}
