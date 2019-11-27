package com.itheima.day_07.demo_07;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_07 {

	/*
		Collections使用（针对Collection集合操作的工具类）
	 */
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(50);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(10);

		System.out.println(list);
		System.out.println("~~~~~~~~~~");
		Collections.sort(list);	//排序
		System.out.println(list);

		Collections.reverse(list);	//反转
		System.out.println(list);

		Collections.shuffle(list);	//打乱顺序
		System.out.println(list);
	}

}
