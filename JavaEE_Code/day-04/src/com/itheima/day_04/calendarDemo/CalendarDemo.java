package com.itheima.day_04.calendarDemo;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		//public void add(int field, int amount):设置具体的字段的偏移量

		c.add(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.YEAR, -1);

		//public final void set(int year, int month, int date):设置具体的年月日

//		c.set(2020,2,1);

		//void set(int field, int value):根据具体的字段的值，设置具体的年月日
//		c.set(Calendar.YEAR, 2020);

		//获取年月日
		int year = c.get(Calendar.YEAR);	//等同于c.get(1)
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);

		System.out.println(year + " " + month + " " + day);

	}
}
