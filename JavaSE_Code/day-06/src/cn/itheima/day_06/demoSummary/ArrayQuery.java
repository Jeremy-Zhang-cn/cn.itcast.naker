package cn.itheima.day_06.demoSummary;

import java.util.Scanner;

public class ArrayQuery {

	/*
		需求：
			已知一个数组，从键盘键入一个数，在该数组中查询该数的索引值，
			并在控制台输出其索引值。
	 */
	public static void main(String[] args) {

		int[] arr = {11,22,33,44,55,66};
		int e;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想要查找的元素：");
		e = sc.nextInt();

		if (query(arr, e) != -1) {	//若返回值不为-1代表数组中有该元素
			System.out.println("你要查找的元素索引是：" + query(arr,e));
		} else {	//若返回值是-1代表数组中没有该元素
			System.out.println("你查找的元素没有包含在该数组内");
		}


	}

	//返回值类型为int, 两个参数类型为int[] arr, int e
	private static int query(int[] arr, int e) {

		for (int i = 0; i < arr.length; i++) {	//遍历数组，若元素e存在于数组中，返回其索引值
			if (arr[i] == e) {
				return i;
			}
		}
		return -1;	//返回-1代表数组中没有该元素
	}
}
