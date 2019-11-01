package day_03;

public class Demo_12_LoopdoWhile {

	//相较于while循环和for循环，do while循环的判断语句会少执行一次
	public static void main(String[] args) {

		int i = 1;
		do {
			System.out.println("hello");
			i++;
		} while (i <= 5);
	}
}
