package com.itheima.day_08.demo_09;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_09 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("day-08/fos.txt", true);	//可追加输入数据

			fos.write("lack of money\r\n".getBytes());	//windows下使用\r\n进行换行
			fos.write("be rich in one single night\r\n".getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {	//fos.nn
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
