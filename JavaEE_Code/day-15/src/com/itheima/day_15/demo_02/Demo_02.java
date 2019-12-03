package com.itheima.day_15.demo_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo_02 {

	/*
		反射获取构造方法并使用
		创建一个对象 ,使用的构造是那一个构造?
		new Student();
		new Student("张三",13,"北京");
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

		//获取Class对象
		Class<?> c = Class.forName("com.itheima.day_15.demo_02.Student");

		//Constructor<?>[] getConstructors() 返回一个包含Constructor对象的数组，
		// Constructor对象反映了由Class对象表示的所有类的公共构造函数
	//	Constructor<?>[] cons = c.getConstructors();

		//Constructor<?>[] getDeclaredConstructors() 返回反映由该Class对象表示的类声明的所有构造函数的Constructor对象的数组
		Constructor<?>[] cons = c.getDeclaredConstructors();

		for (Constructor<?> con : cons) {
			System.out.println(con);
		}

		System.out.println("~~~~~~~~~~~~~~");

		//Constructor<T> getConstructor(Class<?>...parameterTypes)返回一个Constructor对象，该对象反映由该Class对象表示的类的指定公共构造函数
		//Constructor<T> getDeclaredConstructor(Class <?>...parameterTypes)返回一个Constructor对象，该对象反映由此Class对象表示的类活接口的指定构造函数
		//参数：你要获取的构造方法的参数的个数和数据类型对应的字节码文件对象

		//获取的是该类无参构造，即public修饰的构造
		Constructor<?> con = c.getConstructor();
		//就是在确定我使用的是哪一个构造来进行创建对象
		Constructor<?> con1 = c.getConstructor(String.class, int.class);

		//Constructor提供了一个类的单个构造函数的信息和访问权限
		//T newInstance(Object... initargs)使用由此Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例

		//T newInstance() 创建该类的对象，使用的是无参构造创建对象
		Object object = con.newInstance();
		Object object1 = con1.newInstance("张三", 23);
		System.out.println(object);
		System.out.println(object1);

	}
}
