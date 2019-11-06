package cn.itheima.day_06.demoSummary;

import java.util.Random;

public class Judgement {

	/*
		需求：
			在编程比赛中，选手的得分为6名评委所打分数（0~100）去掉最高分和
			最低分之后的4个得分求平均数（忽略小数）。
	 */
	public static void main(String[] args) {

		int[] arr = new int[6];
		autoInitArray(arr);
	//	manuallyInitArray(arr);
		System.out.println("6评委打分为：");
		printArray(arr);
		System.out.println("----------------");
		System.out.println("最高分为：" + getMax(arr));
		System.out.println("最低分为：" + getMin(arr));
		System.out.println("平均分为：" + getAvg(arr));
	}

	//返回值类型为void, 参数类型为int[] arr
	private static void autoInitArray(int[] arr) {    //自动初始化数组

		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
		}
	}

/*
	//返回值类型为void, 参数类型为int[] arr
	private static void manuallyInitArray(int[] arr) {    //手动初始化数组

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("请输入第%d位评委的打分：\n", (i + 1));
			arr[i] = sc.nextInt();
		}
	}
	*/

	//返回值类型为int, 参数类型为int[] arr
	private static int getMax(int[] arr) {    //获取数组中的最大值

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	//返回值类型为int, 参数类型为int[] arr
	private static int getMin(int[] arr) {    //获取数组中的最小值

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}

	//返回值类型为int, 参数类型为int[] arr
	private static int getAvg(int[] arr) {

		int sum = 0;
		for (int i : arr) {		//数组求和
			sum += i;
		}

		//返回除去最高分和最低分之后的平均分
		return (sum - getMax(arr) - getMin(arr)) / (arr.length - 2);
	}

	//返回值类型为void, 参数类型为int[] arr
	private static void printArray(int[] arr) {    //格式化输出数组内容

		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}

}
