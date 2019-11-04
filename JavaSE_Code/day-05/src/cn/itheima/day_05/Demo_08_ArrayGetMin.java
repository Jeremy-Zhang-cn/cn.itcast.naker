package cn.itheima.day_05;

public class Demo_08_ArrayGetMin {

	//获取小数类型数组中的最小值
	public static void main(String[] args) {
		double[] arr = {23.5, 23.2, 56.8, 90.7, 97.1, 75.9};
		System.out.println("数组中的最小值为： " + getMin(arr));
	}

	public static double getMin(double[] arr) {	//返回类型为double，参数为double[] arr
		double min = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			min = arr[i] < min ? arr[i] : min;
		}
		return min;
	}
}
