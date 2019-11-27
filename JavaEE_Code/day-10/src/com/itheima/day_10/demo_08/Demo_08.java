package com.itheima.day_10.demo_08;

import java.util.Properties;
import java.util.Set;

public class Demo_08 {

	/*
		properties练习
	 */
	public static void main(String[] args) {
		//创建集合对象
		Properties prop = new Properties();

		//Object setProperty(String key, String value): 设置集合的键和值，都为String类型，底层调用HashTable的put方法
		prop.setProperty("itheima001", "张三");
		prop.setProperty("itheima002", "李四");
		prop.setProperty("itheima003", "王五");

		//String getProperty(String key): 使用指定的键搜索属性
		System.out.println(prop.getProperty("itheima001", "未找到"));	//如果未找到指定键，返回默认值
		System.out.println(prop.getProperty("itheima01", "未找到"));

		//Set<String> stringPropertyNames(): 返回一个不可修改的键集
		Set<String> keys = prop.stringPropertyNames();
		for (String key : keys) {
		//	System.out.println(key);
			String value = prop.getProperty(key);
			System.out.println(key +" " + value);
		}
	}
}
