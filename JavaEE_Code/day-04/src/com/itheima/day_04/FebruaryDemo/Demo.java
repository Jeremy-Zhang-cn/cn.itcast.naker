package com.itheima.day_04.FebruaryDemo;

import java.util.Calendar;
import java.util.Scanner;

public class Demo {

	/*
		键盘输入任意的年份，判断这一年的二月有多少天
		思路：
			设置日历对象的年、月、日
			年：来自于键盘录入
			月：设置为2，想要求2月的天数，设置为第三个月(因为月份从0开始计算，设置为2即为3月)
			日：1日，向前推一天即为二月的天数
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();

		//设置日历对象的年、月、日
		Calendar c = Calendar.getInstance();
		c.set(year, Calendar.MARCH, 1);
		//从3月份的第一天往前推一天就是二月的最后一天
		c.add(Calendar.DATE, -1);

		//输出天数
		int date = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("这一年的二月共有" + date + "天");

	}
}
