package cn.itheima.ExamDemo.Test_01;

import java.util.Random;

public class ArrayDemo_01 {

	/*
		定义一个长度为5的数组arr1,用于存放5个1~9的随机整数（范围包括1和9），
		再定义一个长度为2的数组arr2，统计arr1中的元素对2取余等于0的个数，保存到arr2[0],
		统计arr1中的元素对3取余等于0的个数，保存到arr2[1]，在控制台打印输出arr2的所有元素
	 */
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[2];
		Random rd = new Random();
		int count1 = 0, count2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rd.nextInt(9) + 1;
			if (arr1[i] % 2 == 0) {
				count1++;
			} else if (arr1[i] % 3 == 0) {
				count2++;
			}
		}
		arr2[0] = count1;
		arr2[1] = count2;

		for (int value : arr2) {
			System.out.println(value);
		}
	}
}
