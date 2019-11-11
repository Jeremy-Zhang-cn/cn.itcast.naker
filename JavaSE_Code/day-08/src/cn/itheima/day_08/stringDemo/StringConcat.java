package cn.itheima.day_08.stringDemo;

public class StringConcat {

	/*
		将int数组中的数据按照指定格式拼接成一个字符串返回
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};

		String s = arrayToString(arr);
		System.out.println(s);
	}

	private static String arrayToString(int[] arr) {

		String str = "";
		str += "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				str += arr[i];
			} else {
				str += arr[i];
				str += ", ";
			}
		}
		str += "]";
		return str;
	}
}
