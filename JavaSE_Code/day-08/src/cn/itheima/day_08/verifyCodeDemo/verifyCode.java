package cn.itheima.day_08.verifyCodeDemo;

import java.util.Random;

public class verifyCode {

	/*
		需求： 随机生成一个6位数的验证码，验证码中可以有大、小写字母，
		至少有一个数字。
		0-9  a-z A-Z
	 */
	public static void main(String[] args) {
		System.out.println("第一种方法产生的验证码为： " + verifyCodeDeliver());
	}


	//第一种方法，随机地产生六个字符，然后利用判断语句直接排除不符合条件的值，
	// 如果出现不符条件的值要重新随机产生，保证能正确的产生6个基础的验证码，
	// 然后再随机地产生一个数字字符，并利用随机数产生索引值，将其替换入基础验证码中，
	// 从而保证验证码中至少存在一个数字字符。
	private static String verifyCodeDeliver() {

		StringBuilder sb = new StringBuilder();
		Random rd = new Random();

		for (int i = 0; i < 6; i++) {
			int value = rd.nextInt(122 - 65 + 1) + 65;
			if (value >= 91 && value <= 96) {    //排除不包含在大小写和数字中的值
				i--;    //保证产生的字符个数为6
				continue;
			} else {
				sb.append((char) value);    //将int型的value强转为char类型，实现获取符合条件的字符的要求
			}
		}

		int index = rd.nextInt(sb.length());
		sb.setCharAt(index, (char) (rd.nextInt(57 - 48 + 1) + 48));    //随机产生一个数字，随机地修改为sb对象的某一索引处的值

		return sb.toString();
	}

	//第二种方法，先生成一个StringBuilder对象，里边存储所有符合条件的字符，
	// 再随机地从中抽取出6个作为基本的验证码，然后随机产生一个数字字符，
	//随机地替换掉基本验证码中的一个来保证至少存在一个数字字符
	private static String verifyCode() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Random rd = new Random();

		for (char c = 'a'; c <= 'z'; c++) {
			sb.append(c);
		}

		for (char c = 'A'; c <= 'Z'; c++) {
			sb.append(c);
		}

		for (char c = '0'; c <= '9'; c++) {
			sb.append(c);
		}

		for (int i = 0; i < 6; i++) {
			sb2.append(sb.charAt(rd.nextInt(sb.length())));
		}

		char c = (char) (rd.nextInt(57 - 48 + 1) + 48);	//产生一个0-9的字符

		sb2.setCharAt(rd.nextInt(sb.length()), c);	//用随机产生的数字字符随机替换sb2某索引处的值，保证其至少有一个数字字符

		return sb2.toString();
	}

}
