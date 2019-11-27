package com.itheima.day_10.demo_06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo_06 {

	public static void main(String[] args) throws IOException {

		//追加数据并且自动刷新
		PrintWriter pw = new PrintWriter(new FileWriter("day-10/pw.txt", true), true	);

		//写数据必须调用println, printf 或者format方法才会自动刷新
		pw.println("hello");

		//释放资源
		pw.close();
	}
}
