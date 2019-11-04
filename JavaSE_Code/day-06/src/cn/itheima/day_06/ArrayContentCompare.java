package cn.itheima.day_06;

public class ArrayContentCompare {

	/*
		判断两个数组中的内容是否相同
	 */
	public static void main(String[] args) {

		int[] arr1 = {11, 22, 33, 44, 55, 66};
		int[] arr2 = {11, 22, 33, 44, 55, 66};

		System.out.println(contentCompare(arr1, arr2));

	}

	//返回值类型为boolean，两个参数为int[] arr1,int[] arr2
	public static boolean contentCompare(int[] arr1, int[] arr2) {

		//判断两个数组的长度是否相同，若不同则直接返回false
		if (arr1.length != arr2.length) {
			return false;
		}

		//逐个判断数组中的每一个元素是否相同，但凡有一个不同则返回false
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		//若以上两个条件都不满足，则返回true
		return true;
	}
}
