package com.itheima.day_04.homework.Demo_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo_03 {

	/*
		分析以下需求，并用代码实现
			1.已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象
			2.将(1)中的日期对象转换为日历类的对象
			3.根据日期对象获取该日期是星期几,以及这一年的第几天
			4.通过键盘录入日期字符串，格式(2015-10-20)
				如输入：2015-10-20，输出"2015年-10月-20日
				是 星期二，是2015年的第 293 天"
	 */
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入日期（xxxx-xx-xx:）");
		String date = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年-MM月-dd日");
		Date d1;
		d1 = sdf.parse(date);

		Calendar c = Calendar.getInstance();
		c.setTime(d1);

		int year = c.get(Calendar.YEAR);
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		String week = null;

		switch (weekday) {

			case 1:
				week = "日";
				break;

			case 2:
				week = "一";
				break;

			case 3:
				week = "二";
				break;

			case 4:
				week = "三";
				break;
			case 5:
				week = "四";
				break;

			case 6:
				week = "五";
				break;

			case 7:
				week = "六";
				break;

		}

		int day = c.get(Calendar.DAY_OF_YEAR);

		System.out.print(sdf2.format(d1));
		System.out.println(" 是星期" + week + ",是" + year + "年的第" + day + "天");

	}
}
