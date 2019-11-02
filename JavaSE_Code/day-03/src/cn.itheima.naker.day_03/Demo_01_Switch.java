package cn.itheima.naker.day_03;
import java.util.*;

public class Demo_01_Switch {

	public static void main(String[] args) {

	//	int day;
		String s;
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入：");
		//day = sc.nextInt();
		s = sc.next();
		switch (s) {

			case "一":
				System.out.println("周一");
				break;
			case "二":
				System.out.println("周二");
				break;
			case "三":
				System.out.println("周三");
				break;
			case "四":
				System.out.println("周四");
				break;
			case "五":
				System.out.println("周五");
				break;
			case "六":
				System.out.println("周六");
				break;
			case "七":
				System.out.println("周日");
				break;
			default:
				System.out.println("输入有误");
				break;
		}
	}
}
