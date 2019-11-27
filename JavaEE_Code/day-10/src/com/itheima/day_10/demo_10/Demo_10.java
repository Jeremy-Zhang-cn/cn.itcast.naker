package com.itheima.day_10.demo_10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo_10 {

	/*
		猜数游戏，限制游戏次数为3
	 */

	public static void main(String[] args) throws IOException {

		GuessNumber guessNumber = new GuessNumber();
		Properties prop = new Properties();
		FileReader fr = new FileReader("day-10/game.properties");
		prop.load(fr);
		fr.close();

		String count = prop.getProperty("count");
		int number = Integer.parseInt(count);

		if (number > 3) {
			System.out.println("游戏次数已达上限，请充值");
		} else {
			guessNumber.start();
			number++;
			prop.setProperty("count", String.valueOf(number));
			
			FileWriter writer = new FileWriter("day-10/game.properties");
			prop.store(writer, null);
			fr.close();
		}


	}
}
