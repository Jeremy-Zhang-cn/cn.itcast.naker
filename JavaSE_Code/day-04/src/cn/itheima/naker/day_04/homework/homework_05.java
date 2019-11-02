package cn.itheima.naker.day_04.homework;

import java.util.Random;

public class homework_05 {

	/*
		分析以下需求并实现
		1.定义一个用于存放班级分数的数组 int[] score;数组长度为5，
		  并使用随机数（范围为0-100）为数组赋值
		2.求出班级不及格人数(分数低于60分的就是不及格)
		3.求出班级的平均分
		4.求出班级的总分数
	 */

	public static void main(String[] args) {

		//定义一个用于存放班级分数的数组 int[] score;数组长度为5
		int[] score = new int[5];

		//使用随机数（范围为0-100）为数组赋值
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {

			score[i] = rd.nextInt(100);

		}

		System.out.println("----------------------");

		System.out.println("各位同学的成绩分别为：");
		for (int i : score) {
			System.out.printf("%d\t", i);
		}
		System.out.println();

		System.out.println("----------------------");

		//求出班级不及格人数(分数低于60分的就是不及格)
		int count = 0;
		for (int i : score) {

			if (i < 60) {
				count++;
			}
		}
		System.out.printf("该班级成绩不合格的人数为：%d\n", count);

		double avg = 0.0;
		int sum = 0;

		for (int i = 0; i < score.length; i++) {

			sum += score[i];    //求出班级的总分数
			avg = sum * 1.0 / score.length;    //求出班级的平均分

		}

		System.out.printf("班级平均分为：%.1f\n", avg);
		System.out.printf("班级总分为：%d\n", sum);

	}
}
