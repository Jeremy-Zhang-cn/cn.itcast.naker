package cn.itheima.day_08.stringDemo;

import java.util.Scanner;

public class CharCount {

	/*
		统计输入字符串中大写、小写、数字的个数
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.nextLine();

		int upperCount = 0;
		int lowerCount = 0;
		int numCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upperCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lowerCount++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				numCount++;
			}
		}

		System.out.println("大写字母有" + upperCount + "个");
		System.out.println("小写字母有" + lowerCount + "个");
		System.out.println("数字有" + numCount + "个");
	}
}
