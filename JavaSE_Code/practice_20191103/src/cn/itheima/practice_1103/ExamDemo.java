package cn.itheima.practice_1103;

import java.util.Scanner;

/*
*考试分数线为23分(包含23)以上为通过,
* 18-23分为待定,18分以下(不包含18)为不通过。
* 定义一个成绩，并使用if语句来判断该成绩是否通过，
* 将结果打印到控制台，如： 成绩为25分，通过。
 */
public class ExamDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = sc.nextInt();

		if (score >= 23) {
			System.out.printf("成绩为%d分，通过\n", score);
		} else if (score >= 18 && score < 23) {
			System.out.printf("成绩为%d分，待定\n", score);
		} else if (score < 18) {
			System.out.printf("成绩为%d分，未通过\n", score);
		} else {
			System.out.println("输入有误，请输入正确的成绩。");
		}
	}
}
