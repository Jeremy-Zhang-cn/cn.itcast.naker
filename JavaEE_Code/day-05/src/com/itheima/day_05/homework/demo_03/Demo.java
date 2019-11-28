package com.itheima.day_05.homework.demo_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
		/*
			使用List集合随机生成10个不重复的数字存入集合中,并遍历集合
		 */
	public static void main(String[] args) {

		Random random = new Random();
		List<Integer> list = new ArrayList<>();

		while (list.size() < 10) {
			int num = random.nextInt(10);
			if (!(list.contains(num))) {
				list.add(num);
			}
		}
		System.out.println(list);
	}

}
