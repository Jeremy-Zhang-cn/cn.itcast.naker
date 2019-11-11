package cn.itheima.day_08.stringDemo;

import java.util.Scanner;

public class StringReverse {

	/*
		实现字符串反转
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.nextLine();
		System.out.println("反转后的字符串为：" + stringReverse(str));

	}

	private static String stringReverse(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;
	}
}
