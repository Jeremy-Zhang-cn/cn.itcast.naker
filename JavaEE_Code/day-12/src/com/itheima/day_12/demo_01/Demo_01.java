package com.itheima.day_12.demo_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo_01 {

	public static void main(String[] args) throws UnknownHostException {

		//public static InetAddress getByName(String host): 确定主机的ip地址
		InetAddress address = InetAddress.getByName("Jeremy");

		//public String getHostName(): 获取ip地址的主机名
		String name = address.getHostName();

		//public String getHostAddress(): 返回文本显示中的ip地址字符串
		String ip = address.getHostAddress();

		System.out.println("主机名：" + name);
		System.out.println("ip地址：" + ip);

	}
}
