package cn.itheima.naker.day_04;

public class Demo_01 {

	public static void main(String[] args) {

		char[] arr = new char[3];

		System.out.println(arr);

		for (char ch : arr) {
			System.out.println(ch);
		}

		arr[0] = 'a';
		arr[2] = 'b';

		System.out.println(arr);	//java针对char数组进行了优化，打印数组中的内容，而不是地址值

		for (char ch : arr) {
			System.out.println(ch);
		}
	}
}
