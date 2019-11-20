package com.itheima.day_06.homework.Demo_03;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo_03 {

	/*
		根据需求完成代码
			1.键盘录入一个字符串，去掉其中重复字符
			2.打印出不同的那些字符，必须保证顺序。
			例如输入：aaaabbbcccddd，打印结果为：abcd。
	 */
	public static void main(String[] args) {

		Set<Character> set = new TreeSet<>();	//字符的封装类
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串:");
		String str = sc.next();
		char[] arr = str.toCharArray();	//将字符串转换为字符数组

		for (char c : arr) {
			set.add(c);
		}

		System.out.println(set);
	}
}
