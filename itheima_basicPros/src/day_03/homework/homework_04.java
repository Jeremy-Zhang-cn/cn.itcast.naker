package day_03.homework;

public class homework_04 {
/*
	分析以下需求，并用代码实现：
		1.按照从大到小的顺序输出四位数中的个位+百位=十位+千位 的数字及个数
		2.每行输出5个满足条件的数，之间用空格分隔
		3.如：9999 9988 9977 9966 9955
 */
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1000; i < 10000; i++) {

			int ge = i % 10;	//得到个位数
			int shi = i % 100 / 10;	//得到十位数
			int bai = i % 1000 / 100;	//得到百位数
			int qian = i / 1000;	//得到千位数

			if ((ge + bai) == (shi + qian)) {	//如果满足位+百位=十位+千位，执行以下代码
				count++;
				System.out.print(i + " ");	//每个数字后跟一个空格

				if (count % 5 == 0) {
					System.out.println("");		//每打印五个数字进行一次换行
				}
			}
		}
		System.out.printf("一共有%d个数满足个位+百位=十位+千位\n",count);
	}
}
