package cn.itheima.day_06.demoSummary;

import java.util.Scanner;

public class LoseWeight_If {

	/*
		使用if语句实现减肥计划
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期数：");
		int week = sc.nextInt();

		if (week < 1 || week > 7) {
			System.out.println("输入有误");
		} else if (week == 1) {
			System.out.println("跑步");
		}else if (week == 2) {
			System.out.println("游泳");
		}else if (week == 3) {
			System.out.println("慢走");
		}else if (week == 4) {
			System.out.println("单车");
		}else if (week == 5) {
			System.out.println("拳击");
		}else if (week == 6) {
			System.out.println("爬山");
		}else{
			System.out.println("好好吃一顿");
		}
	}
}
