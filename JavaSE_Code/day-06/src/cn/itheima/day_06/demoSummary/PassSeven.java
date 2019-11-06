package cn.itheima.day_06.demoSummary;

public class PassSeven {

	//逢7过
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			count++;
			if (count % 5 == 0) {	// 每五个换一行
				System.out.println(i);
			} else {
				if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 == 7)) {
					System.out.print("pass ");
					continue;
				}
				System.out.print(i + "  ");
			}

		}
	}

}
