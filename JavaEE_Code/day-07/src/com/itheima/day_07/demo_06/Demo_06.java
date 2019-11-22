package com.itheima.day_07.demo_06;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Demo_06 {

	/*
		统计输入字符串中各字符的个数
	 */
	public static void main(String[] args) {

		TreeMap<Character, Integer> tm = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");

		String str = sc.nextLine();
		char[] chars = str.toCharArray();

		/*
		//方式1
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			int value = 1;

			if (tm.get(key) == null) {
				tm.put(key, 1);
			} else {
				value++;
				tm.put(key, value);
			}
		}
		*/

		//方式2
		for (char ch : chars) tm.put(ch, tm.containsKey(ch) ? tm.get(ch) + 1 : 1);

		Set<Character> characters = tm.keySet();
		StringBuilder sb = new StringBuilder();
		for (Character character : characters) {
			Integer num = tm.get(character);
			sb.append(character).append("(").append(num).append(")");
		}
		System.out.println(sb.toString());

	}

}
