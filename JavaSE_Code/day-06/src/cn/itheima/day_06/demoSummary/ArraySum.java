package cn.itheima.day_06.demoSummary;

import java.util.Random;

public class ArraySum {

	/*
		数组内容求和, 要求被求和的元素个位和十位都不能是7, 并且为偶数
	 */
	public static void main(String[] args) {

		int[] arr = new int[5];
		autoInitArray(arr);
		System.out.println("数组中的元素有：");
		printArray(arr);
		System.out.println("-----------");
		System.out.println("数组元素之和为：");
		System.out.println(arraySum(arr));


	}

	//返回值类型为void, 参数类型为int[] arr
	private static void autoInitArray(int[] arr) {    //自动初始化数组

		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
		}
	}
	//返回值类型为void, 参数类型为int[] arr
	private static void printArray(int[] arr) {    //格式化输出数组内容

		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}

	//返回值类型为int,参数类型为int[] arr
	private static int arraySum(int[] arr) {

		int sum = 0;
		for (int i : arr) {        //数组求和

			//若该元素个位和十位都没有7，且为偶数，累加
			//如果元素为偶数，其个位注定不能是7, 因此可以省略判断条件 i % 10 != 7
			if ((i / 10 != 7) && (i % 2 == 0)) {
				sum += i;
			}
		}

		return sum;
	}

}
