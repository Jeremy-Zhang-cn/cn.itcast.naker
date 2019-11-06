package cn.itheima.day_06.demoSummary;

public class PrimerArrayCompare {

	/*
		判断两个数组中的内容是否一致。
			对一致的定义：只需要内容全部相同，不需要元素顺序相同。
		思路：
			1. 判断两个数组长度是否相同，若长度不同直接返回false；
			2. 遍历第一个数组，求出每个元素在第一个数组中的个数，同时遍历第二个数组，
			判断相同元素在第二个数组中的个数。
			3. 判断相同元素在各自数组中的个数是否相同，如果不同返回false
			4. 如果以上条件都不满足，返回true
	 */
	public static void main(String[] args) {

		int[] arr1 = {11, 22, 11, 33, 22, 44, 55, 66};
		int[] arr2 = {11, 11, 22, 55, 22, 44, 33, 66};

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arrayCompare(arr1, arr2));

	}

	private static boolean arrayCompare(int[] arr1, int[] arr2) {

		//判断两个数组长度是否相同，若长度不同直接返回false；
		if (arr1.length != arr2.length) {
			return false;
		}
				/*
					遍历第一个数组，求出每个元素在第一个数组中的个数，同时遍历第二个数组，
					判断相同元素在第二个数组中的个数。
				*/

		for (int e : arr1) {    //遍历数组1, 因为两个数组等长，也相当于遍历数组2

			int count_1 = 0;
			int count_2 = 0;

			for (int j = 0; j < arr1.length; j++) {        //分别遍历两个数组
				if (e == arr1[j]) {
					count_1++;        //求出元素e在数组1中的数量
				}
				if (e == arr2[j]) {        //求出元素e在数组2中的数量
					count_2++;
				}

			}

			//判断元素e在各自数组中的个数是否相同，如果不同返回false
			if (count_1 != count_2) {
				return false;
			}
		}

		//如果以上条件都不满足，返回true
		return true;
	}
}
