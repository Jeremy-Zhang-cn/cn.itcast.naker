package com.itheima.day_06.homework.Demo_05;

import java.util.*;

public class Demo_05 {

	/*
		已知数组存放一批QQ号码，QQ号码最长为11位，
		最短为5位String[] strs = {"12345","67891",
		"12347809933","98765432102","67891","12347809933"}。
		将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
		将list中所有元素分别用迭代器和增强for循环打印出来。
	 */
	public static void main(String[] args) {

		String[] str = {"12345","67891",
				"12347809933","98765432102","67891","12347809933"};
		Set<String> set = new HashSet<>();

		Collections.addAll(set, str);
		LinkedList<String> list = new LinkedList<>(set);


		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("~~~~~~~~");

		for (String s : list) {
			System.out.println(s);
		}

	}
}
