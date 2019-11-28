package com.itheima.day_05.homework.demo_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ListTest {

	/*
		使用List集合随机生成10个不重复的数字存入集合中,并遍历集合
	 */
	public static void main(String[] args) {

		Random random = new Random();
		Set<Integer> set = new ConcurrentSkipListSet<>();	//Set类型集合中不存在重复的元素

		while (set.size() < 10) {
			set.add(random.nextInt(20));
		}

		List<Integer> list = new ArrayList<>(set);

		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
