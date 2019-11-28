package com.itheima.day_06.demo_03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo_01 {

	/*
		产生十个不同的随机数，存储到Set中
	 */
	public static void main(String[] args) {

		Random random = new Random();
		Set<Integer> set = new HashSet<>();

		while (set.size() < 10)
			set.add(random.nextInt(10) + 1);

		System.out.println(set);

	}
}
