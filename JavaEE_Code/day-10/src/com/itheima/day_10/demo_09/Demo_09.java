package com.itheima.day_10.demo_09;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo_09 {

	/*
		读取config.properties文件，并加载到Properties集合中
		Properties集合主要用于配置文件的读取
	 */
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		prop.load(new FileReader("day-10/config.properties"));

		String itheima001 = prop.getProperty("itheima001");
		String itheima002 = prop.getProperty("itheima002");
		String itheima003 = prop.getProperty("itheima003");
		String itheima004 = prop.getProperty("itheima004");

		System.out.println(itheima001);
		System.out.println(itheima002);
		System.out.println(itheima003);
		System.out.println(itheima004);

	}
}
