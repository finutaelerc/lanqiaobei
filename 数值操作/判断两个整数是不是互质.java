package 数值操作;

public class 判断两个整数是不是互质 {
//	两书最大公约数为1
	public static void main(String[] args) {
		
		int a = 6;
		int b = 7;
		if (a >= b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (a != 0) {
			int temp = b % a;
			b = a;
			a = temp;
		}
		if (b == 1) {
			System.out.println("互质");
		} else {
			System.out.println("不互质");
		}
	}
}