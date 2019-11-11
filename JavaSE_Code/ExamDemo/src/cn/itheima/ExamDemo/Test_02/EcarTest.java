package cn.itheima.ExamDemo.Test_02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EcarTest {

	/*
		a.定义“电动汽车”类Ecar，包含：
			1） 空参构造、满参构造；
			2） 成员变量： 品牌 brand，价格price，续航 mile;
			3） 所有成员变量的set/get方法

		b. 定义测试类EcarTest, 完成以下需求：
			1） 定义public static ArrayList<Ecar> filter(ArrayList<Ecar> list, int price,int mile方法
			，要求：遍历ArrayList集合，将ArrayList中价格低于参数price,
			并且续航不低于参数mile的元素存入另一个ArrayList<Ecar>中并返回；
			2） main方法中要求： 根据以下内容创建并初始化3个Ecar对象，
			{“威马EX5”，179800,400}，},{"蔚来ES8", 448000,500},{"特斯拉ModelX",828000,552}，
			创建一个ArrayList<Ecar> list_ecar,将上边的3个Ecar对象添加到list_ecar中，
			调用filter方法传入list_ecar,500000和400，方法返回值需要接收，根据接收返回的List集合输出所有元素信息

	 */
	public static void main(String[] args) {

		Ecar ecar1 = new Ecar("威马EX5",179800,400);
		Ecar ecar2 = new Ecar("蔚来ES8",448000,500);
		Ecar ecar3 = new Ecar("特斯拉ModelX",828000,552);

		ArrayList<Ecar> list_ecar = new ArrayList<>();
		list_ecar.add(ecar1);
		list_ecar.add(ecar2);
		list_ecar.add(ecar3);

		ArrayList<Ecar> f = filter(list_ecar, 500000, 400);

		for (int i = 0; i < f.size(); i++) {
			System.out.println(f.get(i).getBrand() + "  " + 
					f.get(i).getPrice() + "元  " + f.get(i).getMile() + "公里");
		}

	}

	public static ArrayList<Ecar> filter(ArrayList<Ecar> list, int price, int mile) {

		ArrayList<Ecar> arrayList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPrice() <= price && list.get(i).getMile() >= mile) {
				arrayList.add(list.get(i));
			}
		}
		return arrayList;
	}
}
