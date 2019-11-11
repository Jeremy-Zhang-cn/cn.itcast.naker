package cn.itheima.day_09.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo_01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("123");
		list.add("456");
		list.add("1");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > 1) {
				//当i = 0时，list.get(0).length=3
				//删除第0位置上的元素"123"
				//此时list长度变为2，"456"索引变为0, "1"的索引变为1, i自增至1
				//1号索引对应元素为"1"判断其长度为1, 不大于1, 不删除
				// 且由于0号索引已经遍历完成，索引值为0的"456"也得以保留
				list.remove(i);
			}
		}
		System.out.println(list);	//输出结果为[456,1]

	}
}
