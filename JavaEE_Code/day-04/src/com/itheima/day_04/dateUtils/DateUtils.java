package com.itheima.day_04.dateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private DateUtils() {
	}

	/**
	 *
	 * @param date 需要格式化的日期
	 * @param format 指定格式
	 * @return 格式化之后的日期字符串
	 */
	public static String dateToString(Date date, String format) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		String dateStr = simpleDateFormat.format(date);
		return dateStr;

	}

	/**
	 *
	 * @param dateStr 格式化的日期字符串
	 * @param format 指定的日期格式
	 * @return  格式化后的日期
	 * @throws ParseException
	 */
	public static Date stringToDate(String dateStr, String format) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		Date date = simpleDateFormat.parse(dateStr);
		return date;

	}
}
