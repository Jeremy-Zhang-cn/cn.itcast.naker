package cn.itheima.day_08.stringDemo;

import java.util.Scanner;

public class StringTraverse {

	/*
		遍历字符串
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
