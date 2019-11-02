package cn.itheima.naker.day_03.homework;

public class homework_05 {

/*
	打印四行五列的星星
	  *****
	  *****
	  *****
	  *****
 */
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print("*");	//每行打印五个*
			}
			System.out.println("");	//每打印五个*后进行换行
		}
	}
}
