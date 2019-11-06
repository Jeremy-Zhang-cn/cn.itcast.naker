package cn.itheima.day_06.demoSummary;

public class ArrayReverse {

	//数组内容反转
	public static void main(String[] args) {

		int[] arr = {11, 22, 33, 44, 55, 66,77};

		System.out.println("反转前的数组为：");
		printArray(arr);
		System.out.println("------------------");
		System.out.println("反转后的数组为：");
		printArray(reverseArray(arr));
	}

	private static int[] reverseArray(int[] arr) {

		int temp;

	/*
		int mid = arr.length / 2;
		int head = 0;
		int tail = arr.length - 1;

		//方法一：以数组索引中值为界，前后对称位置元素互换
		for (int i = 0; i <= mid; i++) {

			temp = arr[head];
			arr[head] = arr[tail];
			arr[tail] = temp;
			head++;
			tail--;
		}
		*/

		//方法二：设置首尾索引，当首索引小于尾索引时，交换对称位置上的元素，当首尾索引相等或首索引大于尾索引时，
		// 说明已达到或越过索引中值，可以结束交换
		for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		return arr;
	}

	private static void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
