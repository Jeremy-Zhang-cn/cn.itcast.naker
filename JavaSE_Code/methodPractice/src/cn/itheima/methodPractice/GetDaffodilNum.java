package cn.itheima.methodPractice;

public class GetDaffodilNum {

	/*
		(1)	定义方法public static boolean isSXH(int num)，功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false。
		(2)	定义方法public static int getCount(),功能：借助isSXH方法，获取100到999以内水仙花个数，
		(3)	定义方法public static int[] getArr(int count)，根据参数值创建int数组，借助isSXH方法，获取100到999以内水仙花数，存入到数组并返回。
		(4)	在main方法中调用getCount方法，获取水仙花的个数，然后调用getArr方法，将水仙花的个数作为参数传递，获取到返回值后遍历打印数组。

	 */
	public static void main(String[] args) {
		int count = getCount();
		int[] arr = getArr(count);
		System.out.println("三位水仙花数有：");
		printArray(arr);

	}

	//返回值类型为boolean，参数类型为 int
	//判断参数是否为水仙花数
	private static boolean isDaffodil(int num) {

		int singleDigit = num % 10;
		int tensDigit = num / 10 % 10;
		int hundredDigit = num / 100;

		return (singleDigit * singleDigit * singleDigit + tensDigit * tensDigit * tensDigit + hundredDigit * hundredDigit * hundredDigit == num);

	}

	//返回值类型为int, 没有参数
	//获取水仙花数个数
	private static int getCount() {

		int count = 0;
		for (int i = 100; i < 1000; i++) {
			if (isDaffodil(i)) {
				count++;
			}
		}
		return count;
	}

	//返回值类型为int[], 参数为int
	//根据水仙花数个数初始化一个数组，用于存储所有的水仙花数
	private static int[] getArr(int count) {

		int[] arr = new int[count];

		for (int i = 100; i < 1000; i++) {
			if (isDaffodil(i)) {
				arr[--count] = i;
			}
		}
		return arr;
	}

	//返回值类型为空，参数为int[]
	//遍历数组，打印所有元素
	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.println(value);
		}
	}
}
