package cn.itheima.day_08.stringDemo;

public class StringBuilderConcat {

	/*
		将int数组中的数据按照指定格式拼接成一个字符串返回
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(arrayToString(arr));

	}

	private static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();

		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
