package cn.itheima.methodPractice;

import java.util.Random;

public class PrintArray {

	/*
		4、定义一个方法printArray，在方法内部定义一个长度为10的数组arr，
		并使用随机数(1到500，包含1和500)给数组赋值，
		然后循环打印出数组中的元素值。
		在main方法中调用printArray方法。（无参数无返回值）
	 */
	public static void main(String[] args) {
		printArray();
	}

	private static void printArray() {

		Random rd = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(500) + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
