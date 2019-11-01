package day_03;

public class Demo_06_LoopFor_OddSum {

	//奇数求和
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) sum += i;

		}

		System.out.println(sum);

	}
}
