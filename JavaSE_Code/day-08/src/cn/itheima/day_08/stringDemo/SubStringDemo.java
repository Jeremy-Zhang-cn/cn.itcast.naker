package cn.itheima.day_08.stringDemo;

public class SubStringDemo {

	/*
		1. 切分字符串 split(短字符串） 切分时留头不留尾
		2. 截取字符串中的一部分
			substring(起始索引） 从指定位置截取到末尾（含头含尾）
			substring(起始索引，结束索引） 从指定位置截取到结束索引位置（含头不含尾）
	 	3. 替换字符串中的指定内容
	 		replace("原字符串中的元素", "替换后的字符串元素")

		tips：字符串中所有的方法都不会改变原字符串的值，运算后会得到一个新的
		字符串对象，必须使用新的字符串对象接收才可以看到运算效果
	 */
	public static void main(String[] args) {
		String s = "javaaajavabbcjava";
		//使用split对字符串s进行切分
		String[] arr = s.split("java");
		System.out.println(arr.length);	//长度为3

		for (String s1 : arr) {
			System.out.println(s1);
		}

		String str = "abcdefghijklm";
		//使用substring(起始索引）截取
		System.out.println(str.substring(2));	//从c开始截取到结束

		//使用substring(起始索引，结束索引）截取
		System.out.println(str.substring(3,6));	//从d开始截取到f（含头不含尾）

		String s1 = "aabbaaccddeebb";
		System.out.println(s1.replace("aa","11"));
	}
}
