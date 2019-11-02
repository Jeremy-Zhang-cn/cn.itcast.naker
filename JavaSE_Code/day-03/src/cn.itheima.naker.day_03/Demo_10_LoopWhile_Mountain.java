package cn.itheima.naker.day_03;

public class Demo_10_LoopWhile_Mountain {

	public static void main(String[] args) {

		int count = 0;
		double paper = 0.1;
		int zf = 8844430;

		while (paper <= zf) {
			paper *= 2;
			count ++;
		}
		System.out.println("一共需要折叠" + count + "次");
	}
}
