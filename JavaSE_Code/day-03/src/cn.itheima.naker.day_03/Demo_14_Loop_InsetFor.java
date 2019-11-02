package cn.itheima.naker.day_03;

public class Demo_14_Loop_InsetFor {

	public static void main(String[] args) {

		for (int hour = 0; hour <= 23; hour++) {
			for (int minute = 1; minute <= 60; minute++) {
				System.out.printf("%d时%d分\n",hour,minute);
			}
		}
	}
}
