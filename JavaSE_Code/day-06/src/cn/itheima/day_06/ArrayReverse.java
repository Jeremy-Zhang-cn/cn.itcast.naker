package cn.itheima.day_06;

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

	public static int[] reverseArray(int[] arr) {

		int mid = arr.length / 2;
		int head = 0;
		int tail = arr.length - 1;
		int temp;

		for (int i = 0; i <= mid; i++) {

			temp = arr[head];
			arr[head] = arr[tail];
			arr[tail] = temp;
			head++;
			tail--;
		}
		return arr;
	}

	public static void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
