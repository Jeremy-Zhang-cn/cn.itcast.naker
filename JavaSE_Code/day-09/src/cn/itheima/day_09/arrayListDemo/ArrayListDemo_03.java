package cn.itheima.day_09.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo_03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/

		for (String s : list) {
			System.out.println(s);
		}
	}
}
