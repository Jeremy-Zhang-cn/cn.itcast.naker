package cn.itheima.methodPractice;

public class GetArray {

	/*
		12、定义一个方法，功能是接收3个整数，然后将这三个整数存到数组中，
		最终把数组返回。在main方法中调用该方法，
		并声明数组变量用来接收方法的返回值，打印遍历数组。（有参数有返回值）
	 */
	public static void main(String[] args) {
		int[] arr = getArray(1, 2, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] getArray(int a, int b, int c) {

		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

		return arr;
	}
}
