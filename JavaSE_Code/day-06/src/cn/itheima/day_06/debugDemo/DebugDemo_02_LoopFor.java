package cn.itheima.day_06.debugDemo;

public class DebugDemo_02_LoopFor {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println("sum: " + sum);
	}
}
