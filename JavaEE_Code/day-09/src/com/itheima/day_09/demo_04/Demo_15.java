package com.itheima.day_09.demo_04;

import java.io.*;

public class Demo_15 {

	public static void main(String[] args) throws IOException {

		/*
		FileReader fr = new FileReader(new File("day-08/data.txt"));
		FileWriter fw = new FileWriter(new File("day-08/data.txt"));
		*/

		//使用字符的缓冲流
		BufferedReader br = new BufferedReader(new FileReader("day-09/data.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("day-09/data2.txt"));

		//一次读取一个字符数组
		int len;
		char[] chars = new char[1024];

		while ((len = br.read(chars)) != -1) {
			bw.write(chars, 0, len);

			bw.flush();
		}

		br.close();
		bw.close();
	}
}
