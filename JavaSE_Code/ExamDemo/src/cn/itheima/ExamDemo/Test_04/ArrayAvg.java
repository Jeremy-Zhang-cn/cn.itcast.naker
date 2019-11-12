package cn.itheima.ExamDemo.Test_04;

import java.util.Random;

public class ArrayAvg {

	/*
		随机⽣成8个1-10之间的数（包括1和10），
		将⽣成的数放到数组中，计算数组元素的平均值，
		并将结果打印到控制台上.
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[8];
		int sum = 0, avg;
		for (int i = 0; i < 8; i++) {
			arr[i] = rd.nextInt(10) + 1;		//生成一个1~10的随机数
			sum += arr[i];
			System.out.print(arr[i] + "  ");
		}
		avg = sum / arr.length;
		System.out.println(avg);
	}
}
