package com.itheima.day_04.homework.Demo_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo_02 {

	/*
		使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
	 */
	public static void main(String[] args) throws ParseException {

		Date d1 = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入日期（xxxx-xx-xx）：");
		String date = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
		d1 = sdf.parse(date);
		System.out.println(sdf2.format(d1));
	}
}
