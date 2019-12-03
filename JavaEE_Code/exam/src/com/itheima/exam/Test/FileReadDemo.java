package com.itheima.exam.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileReadDemo {

	/*
		 用 IO 流，将 People.txt 的内容读取出来，存入到相应的 map 集合，姓名作为键，年龄作为值, 遍历
		 map 集合，将年龄大于 30 的，修改为 30, 输出修改后的元素.
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("exam/People.txt"));
		Map<String,Integer> map = new HashMap<>();

		String s;
		while ((s = br.readLine()) != null) {
			String[] split = s.split("=");
			map.put(split[0], Integer.parseInt(split[1]));
		}
		br.close();

		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue() > 30) {
				entry.setValue(30);
			}
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
