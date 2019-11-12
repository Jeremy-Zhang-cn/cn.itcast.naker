package com.itheima.examination.quiz_02;

import java.util.ArrayList;

public class AvengersTest {

	/*
		1.定义一个Avengers类

			1)属性: 编号id ( int类型 ) ，姓名name（String类型），性别sex （String类型）
		   2)方法：空参满参构造 set、get方法

		2. 在测试类中创建6个对象（对象数据如下），依次将Avengers对象存入集合。

			1,"钢铁侠","男"
			2,"美国队长","男"
			3,"黑寡妇","女"
			4,"绿巨人","男"
			5,"雷神","男"
			6,"星云","女"

		3. 遍历集合删除其中性别为男且姓名长度大于等于3的元素，将剩余的元素数据打印在控制台。
	 */
	public static void main(String[] args) {

		Avengers avengers1 = new Avengers(1, "钢铁侠", "男");
		Avengers avengers2 = new Avengers(2, "美国队长", "男");
		Avengers avengers3 = new Avengers(3, "黑寡妇", "女");
		Avengers avengers4 = new Avengers(4, "绿巨人", "男");
		Avengers avengers5 = new Avengers(5, "雷神", "男");
		Avengers avengers6 = new Avengers(6, "星云", "女");

		ArrayList<Avengers> list = new ArrayList<>();

		list.add(avengers1);
		list.add(avengers2);
		list.add(avengers3);
		list.add(avengers4);
		list.add(avengers5);
		list.add(avengers6);

		for (int i = list.size() - 1; i >= 0; i--) {

			if ("男".equals(list.get(i).getSex()) && (list.get(i).getName().length() >= 3)) {
				list.remove(i);
			}
		}

		for (Avengers avengers : list) {
			System.out.println("id:" + avengers.getId() + "\t性别： " +
					avengers.getSex() + "\t姓名：" + avengers.getName());
		}
	}

}
