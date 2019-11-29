package com.itheima.day_12.demo_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo_01 {

	public static void main(String[] args) throws UnknownHostException {

		//public static InetAddress getByName(String host): 确定主机的ip地址，主机名称可以是机器名称或者ip地址
		//建议使用ip地址作为主机名，因为机器名称是有可能重复的
		InetAddress address = InetAddress.getByName("192.168.17.34");
		InetAddress localHost = InetAddress.getLocalHost();	//获取本机主机名称（ip地址）
		//public String getHostName(): 获取ip地址的主机名
		String name = address.getHostName();
		String s = localHost.getHostName();

		//public String getHostAddress(): 返回文本显示中的ip地址字符串
		String ip = address.getHostAddress();
		String str = localHost.getHostAddress();

		System.out.println("目标主机名：" + name);
		System.out.println("目标ip地址：" + ip);
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("本机主机名：" + s);
		System.out.println("本机ip地址：" + str);

	}
}
