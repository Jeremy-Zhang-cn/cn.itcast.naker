package com.itheima.Demo_01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo_01 {

	public static void main(String[] args) throws IOException {

		String path = JsoupDemo_01.class.getClassLoader().getResource("Student.xml").getPath();
		Document document = Jsoup.parse(new File(path), "utf-8");
		Elements name = document.getElementsByTag("name");
		for (Element element : name) {
			String text = element.text();
			System.out.println(text);
		}
	}

}
