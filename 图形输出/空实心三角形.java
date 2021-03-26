package 图形输出;

public class 空实心三角形 {
	public static void main(String[] args) {
		int a = 9;
		// 实心
		// for (int i = 1; i <=a; i++) {
		// for (int j = a-i; j >0; j--) {
		// System.out.print(" ");
		// }
		// for (int j = 0; j <=i-1; j++) {
		// System.out.print("*"+" ");
		// }
		// System.out.println();
		// }
		// 空心
		for (int i = 1; i <= a; i++) {
			if (i == a) {
				for (int j = 1; j <= a; j++) {
					System.out.print("* ");
				}
			} else if (i == 1) {
				for (int j = 1; j < a; j++) {
					System.out.print(" ");
				}
				System.out.print("* ");
				for (int j = 1; j <= a; j++) {
					System.out.print(" ");
				}
				System.out.println();
			} else {
				int b, c;
				b = a - i;
				c = i - 2;
				for (int j = 1; j <= b; j++) {
					System.out.print(" ");
				}
				System.out.print("* ");
				for (int j = 1; j <= c; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
				System.out.println();
				// System.out.println("中间行");
			}

		}

	}

}
