package com.itheima.day_04.dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo_01 {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		System.out.println(date.getTime());	//获取当前时间毫秒值, 相当于System.currentTimeMillis()

		System.out.println(date.toLocaleString());	//转换为本地时间显示格式

		date.setTime(1574059304880L); 	//设置当前时间

		System.out.println("~~~~~~~~~~~~~~");

		SimpleDateFormat sdf = new SimpleDateFormat();	//默认格式
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//自定义格式
		System.out.println(sdf2.format(date));

		String str = "2019-11-18 15:11:22";

		date = sdf2.parse(str);		//将格式化的字符串转化为日期
		System.out.println(date);

	}
}
