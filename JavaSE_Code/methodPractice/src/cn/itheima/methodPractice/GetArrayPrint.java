package cn.itheima.methodPractice;

public class GetArrayPrint {

	/*
		9、定义一个方法，它可以接收一个int类型数组，并遍历输出数组中的元素。
		在main方法中调用该方法。（有参数无返回值）
	 */
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55};
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
