package com.itheima.day_06.homework.Demo_01;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo_1 {

	/*
		LinkedHashSet基本使用
		使用LinkedHashSet存储以下元素：
		"王昭君","王昭君","西施","杨玉环","貂蝉"。
		使用迭代器和增强for循环遍历LinkedHashSet。
	 */
	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("王昭君");
		lhs.add("王昭君");
		lhs.add("西施");
		lhs.add("杨玉环");
		lhs.add("貂蝉");

		Iterator<String> iterator = lhs.iterator();

		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
		System.out.println("~~~~~~~~~~~~");

		for (String lh : lhs) {
			System.out.println(lh);
		}

	}
}
