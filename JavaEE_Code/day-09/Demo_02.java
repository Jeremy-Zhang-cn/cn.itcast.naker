package com.itheima.day_08.demo_02;

import java.io.File;
import java.io.IOException;

public class Demo_02 {

	public static void main(String[] args) throws IOException {

		//创建文件
		File f0 = new File("D:/itcast/a.java");	//绝对路径
		boolean flag = f0.createNewFile();
		System.out.println(flag);

		//创建目录
		File f1 = new File("D:/itcast/itheima");
		boolean flag1 = f1.mkdir();
		System.out.println(flag1);

		//创建多级目录
		File f2 = new File("D:/itcast/a/b/c");
		System.out.println(f2.mkdirs());

	}
}
