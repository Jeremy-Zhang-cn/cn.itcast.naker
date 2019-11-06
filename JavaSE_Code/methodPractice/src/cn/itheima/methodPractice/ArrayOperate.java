package cn.itheima.methodPractice;

public class ArrayOperate {

	/*
		1.定义一个无返回值的方法，传入一个int类型数组，求出该数组中的最大值、最小值和平均值并输出。
		2.在main方法中定义一个int类型的数组{ 8, 3, 6, 9, 14 }，调用上述方法进行测试。

	 */
	public static void main(String[] args) {
		int[] arr = {8, 3, 6, 9, 14};
		arrayOperate(arr);
	}

	private static void arrayOperate(int[] arr) {

		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			max = Math.max(max, arr[i]);
			sum += arr[i];
		}
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}

		System.out.println("数组中的最大值为：" + max);
		System.out.println("数组中的最小值为：" + min);
		System.out.println("数组内所有元素的平均值为：" + (sum / arr.length));
	}

}
