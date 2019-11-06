package cn.itheima.day_05.extra_work;

public class GetScore {

	/*
		假如你的班主任老师给你安排了一个任务,让你统计出班级本次考试中90分以上的学生,
		并将这些学生的分数整理成一份新的成绩表交给他;请使用你学过的技术,模拟上述的场景;

		已知条件:
		班级所有学生分数:[59,88,99,89,96,85,100,66]
	 */
	public static void main(String[] args) {

		int[] arr = {59, 88, 99, 89, 96, 85, 100, 66};
		int[] score = getScore(arr);
		System.out.printf("大于90分的同学共有%d个，分别是: ", score.length);
		for (int i = 0; i < score.length; i++) {
				System.out.print(score[i] + " ");
		}

	}

	private static int[] getScore(int[] arr) {

		int count = 0;
		for (int item : arr) {	//统计大于90分的人数
			if (item >= 90) {
				count++;
			}
		}

		int[] score = new int[count];
		for (int value : arr) {	//将大于90分的分数放入score数组中
			if (value >= 90) {
				score[--count] = value;    //先自减，后将arr[i]赋值给score[count-1]
			}
		}
		return score;
	}
}
