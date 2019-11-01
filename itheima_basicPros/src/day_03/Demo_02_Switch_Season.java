package day_03;
import java.util.*;
public class Demo_02_Switch_Season {

	public static void main(String[] args) {

		int month;
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入月份：");
		month = sc.nextInt();

		switch (month) {
			case 1:
			case 2:
			case 12:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.printf("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.printf("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.printf("秋季");
				break;
			default:
				System.out.println("输入有误");
				break;
		}
	}
}
