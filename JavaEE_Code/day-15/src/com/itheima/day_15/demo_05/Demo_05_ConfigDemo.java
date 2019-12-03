package com.itheima.day_15.demo_05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo_05_ConfigDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

		// 第一: 用的是哪一个类 第二: 用这个类中的哪一个方法 类的全路径

		//加载数据
		//读取配置文件中的内容，加载到Properties集合中
		Properties prop = new Properties();
		FileReader fr = new FileReader("day-15/config.properties");
		prop.load(fr);
		fr.close();

		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");

		//使用反射 反射配置文件中的类以及运行配置文件中的方法
		Class<?> c = Class.forName(className);
		Constructor<?> con = c.getConstructor();

		Object o = con.newInstance();

		Method method = c.getMethod(methodName);

		method.invoke(o);

	}
}
