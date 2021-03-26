package 图形输出;

public class 边长为N奇偶阵 {
	// 10101010
	// 01010101
	// 10101010
	// 01010101
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 0) {
					System.out.print("01");
				} else {
					System.out.print("10");
				}
			}
			System.out.println();
		}
	}

}
