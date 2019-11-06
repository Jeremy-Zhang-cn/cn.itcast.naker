package cn.itheima.methodPractice;

import java.util.Scanner;

public class ArrayGetIndex {

	/*
		18、现有整数数组包含如下元素：{ 11 , 22 , 33 , 22 , 11 }，
		获取一个键盘录入的整数num，判断num在数组中最后出现的角标位置并在
		控制台打印输出，如元素在数组中不存在，也输出对应提示信息，
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要查询的数字：");
		int i = sc.nextInt();
		int[] arr = {11, 22, 33, 22, 11};

		int a = getIndex(arr,i);
		//根据索引值给出对应提示
		if (a != -1) {
			System.out.println(i + "最后出现位置的索引是：" + a);
		} else {
			System.out.println("你要查找的数字不在数组内");
		}
	}

	private static int getIndex(int[] arr,int i) {

		int index = -1;		//初始化index为-1，代表无查询结果
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				index = j;
			}
		}

		return index;	//获取i最后出现位置的索引值
	}
}
