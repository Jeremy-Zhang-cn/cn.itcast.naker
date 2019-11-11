package cn.itheima.day_08.stringDemo;

import java.util.Scanner;

public class StringBuilderReverse {

	/*
		使用StringBuilder实现字符串的反转
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.nextLine();
		System.out.println("反转后的字符串为：" +reverse(str));;
	}

	private static String reverse(String s) {

		/*StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();*/

		return new StringBuilder(s).reverse().toString();
	}
}
