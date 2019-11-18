package com.itheima.day_04.homework.Demo_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo_01 {

	/*
		需求: 请使用日期时间相关的API，计算出一个人已经出生了多少天。
	 */
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生日期：(xxxx年xx月xx日)");
		String birthday = sc.next();
		Date now = new Date();
		Date birth;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		birth = sdf.parse(birthday);	//将格式化输入的日期字符串转化为日期对象
		long time = now.getTime() - birth.getTime();	//通过getTime()方法获取毫秒值

		//当前时间毫秒值与出生时间毫秒值相减
		System.out.println("出生时间为：" + time / (1000 * 60 * 60 * 24) + "天");



	}
}
