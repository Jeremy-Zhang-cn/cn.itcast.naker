package com.itheima.day_04.sortString;

import java.util.Arrays;

public class StringSort {

	/*
		将一个字符串中的内容进行排序
		原字符串："91 27 46 38 50"
		输出字符串： "27 38 46 50 91"

		思路：
			使用split()方法切分字符串，再将字符串转换为int类型，
			再进行排序输出。
	 */
	public static void main(String[] args) {

		String str = "91 27 46 38 50";

		String[] strArray = str.split(" ");	//以空格为分隔符，使用String的split()方法切分字符串

		int[] arr = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);		//使用parseInt方法将字符串类型数据转换为int类型
		}

		Arrays.sort(arr);	//使用Arrays的sort方法进行排序

		//打印输出
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i]).append(" ");
			}
		}

		System.out.println(sb.toString());

	}
}
