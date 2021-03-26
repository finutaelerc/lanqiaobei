package 数值操作;

public class 正向输出整数的每一位 {
	public static void main(String[] args) {
		int shu = 12345;
		int s = 0;
		int b = 10;
		for (int i = 1; i > 0; i++) {
			if (shu > 10) {
				shu = shu / b;
				System.out.print(shu + " ");
				s++;
				b = b * 10;
			} else {
				break;
			}
		}

	}
}