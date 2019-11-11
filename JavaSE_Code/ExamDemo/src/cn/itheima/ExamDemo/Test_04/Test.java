package cn.itheima.ExamDemo.Test_04;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	/*
		按顺序完成以下要求：
			a. 创建⼀个电⻋类（Tram），属性有：品牌（String类型）、
			价格（int类型）、已⾏驶距离（int类型）⽣成对应的set/get⽅法以及空参、满参构造；
			b. 创建Test类，在main⽅法中创建出三个电⻋对象，品牌名和价格⾃拟，
			“已⾏驶距离”属性值需要随机⽣成（随机数需⽣成3个，范围：0-2000之间的整数，包括0和2000）；
			c. 将创建好的三个电⻋对象存⼊ ArrayList<Tram> 集合中
			d. 查找集合中是否存在“已⾏驶距离”在1000以下的电⻋，存在，
			则将该电⻋的品牌、价格和⾏驶距离打印到控制台上；否则：输出“没有⾏
			驶距离在1000以下的电⻋”；
	 */
	public static void main(String[] args) {

		Random rd = new Random();

		Tram tram1 = new Tram("比亚迪", 100000, rd.nextInt(2001));
		Tram tram2 = new Tram("特斯拉", 350000, rd.nextInt(2001));
		Tram tram3 = new Tram("一汽", 150000, rd.nextInt(2001));

		ArrayList<Tram> list = new ArrayList<>();
		list.add(tram1);
		list.add(tram2);
		list.add(tram3);

		isOverwhelm(list);

		System.out.println("----------------");

		for (Tram tram : list) {
			printElemInfo(tram);
		}

	}

	private static void isOverwhelm(ArrayList<Tram> list) {	//遍历集合，判断里程是否超过指定条件

		int count = 0;	//设置一个判断标志

		for (Tram tram : list) {	//foreach循环遍历
			if (tram.getMile() < 1000) {
				printElemInfo(tram);
				count++;	//每获取到一个符合条件的对象元素，数量加1
			}
		}

		if (count == 0) {	//如果循环结束仍没有发现符合条件的对象，输出对应提示
			System.out.println("没有行驶距离低于1000公里的车");
		}
	}

	private static void printElemInfo(Tram tram) {	//格式化输出对象各属性
		System.out.println("Tram{品牌=‘" + tram.getBrand() + "’, 价格=" +
				tram.getPrice() + ", 已行驶距离=" + tram.getMile() + "}");
	}

}
