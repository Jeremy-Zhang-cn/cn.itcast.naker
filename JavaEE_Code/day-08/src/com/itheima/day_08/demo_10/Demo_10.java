package com.itheima.day_08.demo_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_10 {
	//复制文本内容到另一个文本中
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("day-08/fos.txt");		//读取的目标文件
			fos = new FileOutputStream("day-08/copy.txt");	//写入的目标文件
			int b;
			while ((b = fis.read()) != -1) {	//在读到文件末尾前顺序读入内容
			//	System.out.print((char) b);
				fos.write(b);	//将读取的内容依次写入另一个文本中
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {		//关流释放资源，能关一个是一个

			try {
				if (fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
