package com.itheima.day_08.demo_03;

import java.io.File;
import java.io.IOException;

public class Demo_03_deleteFile {

	public static void main(String[] args) throws IOException {

		File f1 = new File("day-08/a.txt");	//相对路径

	//	System.out.println(f1.createNewFile());

		File f2 = new File("day-08/a/b");
		System.out.println(f2.mkdirs());

		File f3 = new File(f2, "b.txt");
		System.out.println(f3.createNewFile());

		System.out.println(f1.delete());
		System.out.println(f3.delete());
		System.out.println(f2.delete());	//只有当前目录下没有任何内容时才能成功删除

	}
}
