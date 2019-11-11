package cn.itheima.day_09.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo_04_RemoveString {

	/*
		删除集合中所有姓张的人
		tips:当删除集合中的某一个元素时，后边的元素会自动向前补位
			解决方案：1. 正向遍历的时候，每删除一个元素，令索引--；
					 2. 逆向遍历
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王桑");
		list.add("王五");
		list.add("张无忌");
		list.add("李桑");
		list.add("赵六");

		System.out.println(list);

		System.out.println("---------------");

		//遍历集合，判断集合中的每个元素是否符合条件，移除符合条件的元素
		/*
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).startsWith("张")) {
				System.out.println(list.remove(i));
				i--;
			}
		}
		*/

		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).startsWith("张")) {        //删除以“张”开头的元素
				System.out.println(list.remove(i));
			}
		}

		System.out.println("---------------");

		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).endsWith("桑")) {
				System.out.println(list.remove(i));
			}
		}

		System.out.println("---------------");
		System.out.println(list);
	}
}
