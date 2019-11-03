package cn.itheima.practice_1103;

import java.util.Random;
import java.util.Scanner;

public class SimpleArrayDemo_03 {

	/*
		按要求在main方法中完成以下功能：
			(1)	定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字（无需用代码判断，提示语即可）作为数组元素
			(2)	生成2-10（范围包含2和10）之间的随机数num
			(3)	遍历数组arr,筛选出数组中不是num倍数的元素并输出
	 */
	public static void main(String[] args) {

		int[] arr = new int[5];
		int num;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		num = rd.nextInt(9) + 2;

		System.out.printf("产生的随机数num为：%d\n", num);

		for (int i = 0; i < arr.length; i++) {

			System.out.printf("请输入第%d个数（1~60之间）：\n", (i + 1));
			arr[i] = sc.nextInt();

		}


		System.out.println("符合条件的元素有：");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % num != 0) {
				System.out.print(arr[i] + "\t");

			}
		}


	}
}
