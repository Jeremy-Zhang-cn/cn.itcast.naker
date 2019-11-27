package com.itheima.day_10.demo_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo_02 {

	/*
		读取集合中的内容，存储到文件中
	 */
	public static void main(String[] args) throws IOException {

		ArrayList<String> list = new ArrayList<>();

		list.add("hello");
		list.add("javaEE");

		BufferedWriter bw = new BufferedWriter(new FileWriter("day-10/array.txt"));

		for (String s : list) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		bw.close();
	}
}
