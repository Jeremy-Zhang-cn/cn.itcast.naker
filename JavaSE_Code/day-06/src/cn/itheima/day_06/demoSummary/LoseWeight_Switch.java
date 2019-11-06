package cn.itheima.day_06.demoSummary;

import java.util.Scanner;

public class LoseWeight_Switch {
	/*
			使用if语句实现减肥计划
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期数：");
		int week = sc.nextInt();

		switch (week) {

			case 1:
				System.out.println("跑步");
				break;

			case 2:
				System.out.println("游泳");
				break;

			case 3:
				System.out.println("慢走");
				break;

			case 4:
				System.out.println("单车");
				break;

			case 5:
				System.out.println("拳击");
				break;

			case 6:
				System.out.println("爬山");
				break;

			case 7:
				System.out.println("好好吃一顿");
				break;

			default:
				System.out.println("输入有误");
				break;
		}
	}
}
