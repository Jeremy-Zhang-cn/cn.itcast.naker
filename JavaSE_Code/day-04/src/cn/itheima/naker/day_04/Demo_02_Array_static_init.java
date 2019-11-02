package cn.itheima.naker.day_04;

public class Demo_02_Array_static_init {
	//数组的静态初始化
	public static void main(String[] args) {

		double[] arr = {1.0, 2.0, 3.0};    //简化格式（推荐）

		char[] arr2 = new char[]{'a', 'b', 'c'}; //完整格式

		for (double d : arr) {
			System.out.println(d);
		}

		System.out.println("-------------");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}

		System.out.println("------------");

		for (char ch : arr2) {
			System.out.println(ch);
		}
		System.out.println("------------");

		int[] arr3 = {23, 43, 16, 17, 28};
		int max = arr3[0];

		int min = arr3[0];

		for (int a : arr3) {
			if (a > max) {
				max = a;
			}
		}
		System.out.println("max:" + max);

		System.out.println("------------");

		for (int i = 1; i < arr3.length; i++) {
			if (min > arr3[i]) {
				min = arr3[i];
			}
		}
		System.out.println("min:" + min);
	}
}
