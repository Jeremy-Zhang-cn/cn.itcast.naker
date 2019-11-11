package cn.itheima.day_08.stringDemo;

import java.util.Scanner;

public class StringDemo_CountSubstring {

	/*
		需求：
			使用键盘输入两个字符串（一大一小），使用代码计算出小字符在大字符串
			中出现的次数。
		分析：
			1. 使用replaceAll方法，将大字符中的所有小字符串替换为空字符串
			2. 使用原来的字符串的长度-新字符串的长度，然后使用差值除以小字符串的长度即可
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		String large = sc.next();
		System.out.println("请输入第二个字符串：");
		String small = sc.next();

		String newStr = large.replace(small, "");	//将所有小的字符串替换为空串
		System.out.println("大字符串中共有" +
				(large.length() - newStr.length()) / small.length() + "个小字符串");

	}
}
