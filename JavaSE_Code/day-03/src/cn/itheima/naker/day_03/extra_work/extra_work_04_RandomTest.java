package cn.itheima.naker.day_03.extra_work;

import java.util.Random;

public class extra_work_04_RandomTest {

	/*
		使用Random类中的nextInt方法,生成5个25至35之间的随机数并打印出来;
		(其中25和35也算作合法数字)
	 */

	public static void main(String[] args) {
		Random rd = new Random();

		for (int i = 1; i <= 5; i++) {
			System.out.printf("第%d次生成的随机数是：%d \n", i, (rd.nextInt(11) + 25));
		}
	}
}
