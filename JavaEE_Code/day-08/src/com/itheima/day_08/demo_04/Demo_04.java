package com.itheima.day_08.demo_04;

import java.io.File;

public class Demo_04 {

	public static void main(String[] args) {

		File f1 = new File("D:/itcast/test");
		System.out.println(f1.exists());

		System.out.println(f1.getAbsolutePath());	//获取绝对路径
		System.out.println(f1.getPath());	//获取File对象中写的路径

		System.out.println("~~~~~~~~");

		File f2 = new File("D:/itcast");
		File[] files = f2.listFiles();	//获取当前路径下的所有文件和目录，封装为File类对象
		for (File file : files) {
			System.out.println(file);
		}

		System.out.println("~~~~~~~~~~");

		String[] list = f2.list();	//获取当前路径下所有文件和目录的名字，存放在字符串数组中
		for (String s : list) {
			System.out.println(s);
		}
	}
}
