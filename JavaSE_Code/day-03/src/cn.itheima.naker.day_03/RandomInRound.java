package cn.itheima.naker.day_03;

import java.util.Random;

public class RandomInRound {

	//生成指定范围内(50-80)的随机数

	public static void main(String[] args) {

		int num;
		Random r = new Random();
		num = r.nextInt(31) + 50;
		/*
		 * 公式： int x = r.nextInt(上限 - 下限 + 1) + 下限;
		 */

		System.out.println(num);

	}
}
