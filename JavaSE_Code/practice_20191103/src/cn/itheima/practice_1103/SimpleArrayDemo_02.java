package cn.itheima.practice_1103;

import java.util.Random;
import java.util.Scanner;

public class SimpleArrayDemo_02 {

	/*
	按要求在main方法中完成以下功能：
		(1)	定义一个长度为10的int类型数组arr，使用随机数为数组循环赋值，随机数范围为10-99（包含10和99）
		(2)	提示用户键盘录入一个1-5之间（包含1和5，无需用代码判断，提示语即可）的整数num
		(3)	遍历arr，如果元素的十位或者个位数字是num的倍数（0视为任意数字的倍数），则输出该元素
	 */
	public static void main(String[] args) {

		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(90) + 10;
		}

		System.out.println("随机生成的数组中的元素为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("");
		System.out.println("请输入一个1~5之间的整数：");
		num = sc.nextInt();

		System.out.println("符合条件的元素有：");
		if (num >= 1 && num <= 5) {

			for (int i = 0; i < arr.length; i++) {

				int singleDigit = arr[i] % 10;
				int tensDigit = arr[i] / 10;

				if (tensDigit % num == 0 || singleDigit % num == 0) {
					System.out.println(arr[i]);
				}
			}
		} else {
			System.out.println("输入有误");
		}
	}
}
