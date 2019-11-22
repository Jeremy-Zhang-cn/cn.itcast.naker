package com.itheima.day_07.homework.demo_04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test_04 {

	/*
		分析以下需求，并用代码实现
		1.统计每个单词出现的次数
		2.有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
		3.打印格式：
			to=3
			think=1
			you=2
			........
	 */
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入字符串：");
		String str = scanner.nextLine();

		String[] s = str.split(" ");

		for (String st : s) map.put(st, map.containsKey(st) ? map.get(st) + 1 : 1);


		Set<String> strings = map.keySet();
		for (String string : strings) {
			System.out.println(string + "=" + map.get(string));
		}
	}
}
