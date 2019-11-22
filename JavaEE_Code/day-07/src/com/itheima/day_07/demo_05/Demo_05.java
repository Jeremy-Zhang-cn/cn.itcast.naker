package com.itheima.day_07.demo_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_05 {

	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> hm = new HashMap<>();

		ArrayList<String> array1 = new ArrayList<>();
		array1.add("aa");
		array1.add("bb");
		array1.add("cc");
		hm.put("a1", array1);

		ArrayList<String> array2 = new ArrayList<>();
		array2.add("aa");
		array2.add("bb");
		array2.add("cc");
		hm.put("a2", array2);

		ArrayList<String> array3 = new ArrayList<>();
		array3.add("aa");
		array3.add("bb");
		array3.add("cc");
		hm.put("a3", array3);

		/*Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
		for (Map.Entry<String, ArrayList<String>> entry : entries) {
			System.out.println(entry);
		}
*/
		Set<String> strings = hm.keySet();
		for (String string : strings) {
			ArrayList<String> list = hm.get(string);
			for (String s : list) {
				System.out.print(s + "  ");
			}

			System.out.println();
		}
	}

}
