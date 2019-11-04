package cn.itheima.day_05;

public class Demo_07_ArrayLookThrough {

	//以特定格式遍历数组
	public static void main(String[] args) {

		int[] arr = {11, 22, 33, 44, 55, 66};
		printArray(arr);

	}


	private static void printArray(int[] arr) {    //返回值类型为void 参数为int[] arr

		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);        //判断是否为最后一个元素，如果是，其后不再加", "
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");

	}

}
