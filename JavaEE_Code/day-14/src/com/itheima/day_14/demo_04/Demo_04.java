package com.itheima.day_14.demo_04;

import java.util.function.Consumer;

public class Demo_04 {

	/*
		使用Consumer消费数据
			字符串数组中有多条信息，请按照格式："姓名：XX,年龄：XX"的格式将信息打印出来
		要求：
			把打印姓名的动作作为第一个Consumer接口的Lambda实例
			把打印年龄的动作作为第二个Consumer接口的Lambda实例
			将两个Consumer接口按照顺序组合到一起使用
	 */
	public static void main(String[] args) {

		String[] array = {"张三,23", "李四,24"};
		printInfo(array, str ->
			System.out.print("姓名："+str.split(",")[0] + ","),
				str -> System.out.println("年龄："+str.split(",")[1]));
	}

	private static void printInfo(String[] array, Consumer<String> con1, Consumer<String> con2) {

		for (String s : array) {
			con1.andThen(con2).accept(s);
		}
	}
}
