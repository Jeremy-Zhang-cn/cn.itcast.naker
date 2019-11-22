package com.itheima.day_07.homework.demo_03;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test_03 {

	/*
		分析以下需求，并用代码实现
		1.利用键盘录入，输入一个字符串
		2.统计该字符串中各个字符的数量(提示:字符不用排序)
		3.如：
			用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
			程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
	 */
	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");

		String str = sc.nextLine();

		char[] chars = str.toCharArray();
		for (char ch : chars) map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);


		StringBuilder sb = new StringBuilder();

		Set<Character> characters = map.keySet();
		for (Character key : characters) {
			sb.append(key).append("(").append(map.get(key)).append(")");
		}

		System.out.println(sb.toString());
	}

}
