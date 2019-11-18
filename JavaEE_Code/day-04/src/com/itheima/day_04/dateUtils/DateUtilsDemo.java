package com.itheima.day_04.dateUtils;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		String dateStr = DateUtils.dateToString(date, "yyyy-MM-dd");
		System.out.println(dateStr);

		date = DateUtils.stringToDate("2019-11-18", "yyyy-MM-dd");
		System.out.println(date);
	}
}
