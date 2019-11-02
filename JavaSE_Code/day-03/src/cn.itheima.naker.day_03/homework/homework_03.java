package cn.itheima.naker.day_03.homework;

public class homework_03 {
/*
	分析以下需求并实现
		1.打印1到100之内的整数，但数字中包含9的要跳过
		2.每行输出5个满足条件的数，之间用空格分隔
		3.如：1 2 3 4 5
*/
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 9 || i / 10 == 9) {  	//个位或者十位上有9的都跳过
				continue;
			}

			System.out.print(i + " ");	//每个数字后跟一个空格
			count++;
			if (count % 5 == 0){
				System.out.println("");		//每5个数字输出一个换行，实现每行输出五个数
			}
		}

	}
}
