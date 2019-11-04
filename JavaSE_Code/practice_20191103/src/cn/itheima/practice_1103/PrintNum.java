package cn.itheima.practice_1103;

import java.util.Scanner;

public class PrintNum {

	/*
	 *（附加题）通过键盘录入一个四位数，
	 * 分别取出每一位上的数字，并按照一定格式打印输出。
	 * 如:"数字3251的个位是 1, 十位是 5, 百位是 2，千位是3
	 */
	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个四位数：");
		num = sc.nextInt();

		if (num >= 1000 && num <= 9999) {

			int singleDigit = num % 10;
			int tensDigit = num / 10 % 10;
			int hundredDigit = num / 100 % 10;
			int thousandDigit = num / 1000;

			System.out.printf("数字%d的个位是%d，十位是%d，百位是%d，千位是%d",num,singleDigit,tensDigit,hundredDigit,thousandDigit);

		} else {
			System.out.println("输入有误，请输入一个正确的四位数字。");
		}
	}
}
