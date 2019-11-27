package com.itheima.day_10.demo_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo_01 {

	/*
		从文件中读取内容存入到集合中
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("day-10/array.txt"));
		ArrayList<String> list = new ArrayList<>();

		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}

		br.close();

		for (String s : list) {
			System.out.println(s);
		}
	}
}
