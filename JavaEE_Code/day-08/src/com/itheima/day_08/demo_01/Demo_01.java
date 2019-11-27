package com.itheima.day_08.demo_01;

import java.io.File;

public class Demo_01 {

	public static void main(String[] args) {

		//构造方法1：
		File f1 = new File("D:/itcast/java.txt");
	//	File f11 = new File("D:\\itcast\\java.txt");	//使用两个反斜杠分隔也可以

		System.out.println(f1);
		//构造方法2：
		File f2 = new File("D:/itcast", "java.txt");
		System.out.println(f2);

		//构造方法3：
		File srcFile = new File("D:/itcast");
		File f3 = new File(srcFile, "java.txt");
		System.out.println(f3);

	}
}
