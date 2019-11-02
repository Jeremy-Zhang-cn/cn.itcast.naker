package cn.itheima.naker.day_03;

public class Demo_11_LoopFor_Mountain {

	public static void main(String[] args) {

		int count = 0;
		int zf = 8844430;

		for (double paper = 0.1; paper <= zf; paper *= 2) {
			count ++;
		}

		System.out.printf("一共需要折叠%d次",count);
	}
}
