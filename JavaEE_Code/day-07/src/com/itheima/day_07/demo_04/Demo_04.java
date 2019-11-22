package com.itheima.day_07.demo_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_04 {

	public static void main(String[] args) {

		ArrayList<HashMap<String, String>> array =new ArrayList<>();

		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("a1", "a");
		hm1.put("b1", "b");
		array.add(hm1);

		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("a2", "a");
		hm2.put("b2", "b");
		array.add(hm2);

		HashMap<String, String> hm3 = new HashMap<>();
		hm3.put("a3", "a");
		hm3.put("b3", "b");
		array.add(hm3);

	/*	for (HashMap<String, String> stringStringHashMap : array) {
			Set<String> strings = stringStringHashMap.keySet();
			for (String string : strings) {
				System.out.println(string + "=" + stringStringHashMap.get(string));
			}
		}*/

		for (HashMap<String, String> map : array) {

			Set<Map.Entry<String, String>> entries = map.entrySet();

			for (Map.Entry<String, String> entry : entries) {
				System.out.println(entry);
			}
			System.out.println();
		}

	}
}
