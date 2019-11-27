package com.itheima.day_10.demo_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Demo_03 {

	/*
		随机点名器
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("day-10/names.txt"));

		ArrayList<String> list = new ArrayList<>();

		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}

		br.close();

		Random random = new Random();
		int index = random.nextInt(list.size());
		System.out.println(list.get(index) + "是天选之人!");

	}
}
