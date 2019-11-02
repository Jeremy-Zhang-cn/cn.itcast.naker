package cn.itheima.naker.day_03.extra_work;

public class extra_work_03_LoopFor {

	/*
		请使用for循环打印出10至100之间包含6的数字;
	 */
	public static void main(String[] args) {

		//1:写一个for循环,起始条件和结束条件分别设置为10和100;
		for (int i = 10; i < 100; i++) {

			//2:在循环中计算当前数字的个位和十位数字;
			int a = i % 10;    //获取个位数
			int b = i / 10;    //获取十位数

			//3:判断个位和十位数字中只有包含了6就可以打印这个数字;
			if (a == 6 || b == 6) {

				System.out.println(i);

			}
		}
	}
}
