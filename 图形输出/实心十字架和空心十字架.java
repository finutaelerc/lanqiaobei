package 图形输出;

public class 实心十字架和空心十字架 {
	// 高度为N,宽度为M的实心十字架和空心十字架：
	public static void main(String[] args) {
		int n = 13;
		int m = 13;
		//实心
			for (int i = 0; i < n; i++) {
				if (i < n / 3) {
					for (int j = 0; j < (m / 3); j++) {
						System.out.print(" ");
					}
					for (int j = (m / 3); j < (m / 3) * 2+1; j++) {
						System.out.print("*");
					}

				} else if (i <= (n / 3) * 2) {
					for (int j = 0; j <m; j++) {
						System.out.print("*");
					}

				}else {
					for (int j = 0; j < (m / 3); j++) {
						System.out.print(" ");
					}
					for (int j = (m / 3); j < (m / 3) * 2+1; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println();
			//空心
			for (int i = 0; i < n; i++) {
				if (i < n / 3) {
					for (int j = 0; j < (m / 3); j++) {
						System.out.print(" ");
					}
					for (int j = (m / 3); j < (m / 3) * 2 + 1; j++) {
						if (j == (m / 3) || i == 0 || j == (m / 3) * 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				} else if (i <= (n / 3) * 2) {
					for (int j = 0; j < m; j++) {
						if (i == n / 3 && j >= m / 3+1 && j <= (m / 3) * 2-1
								|| i == (n / 3) * 2 && j >= m / 3+1  && j <= (m / 3) * 2 -1)  {
							System.out.print(" ");
						} else if(i == n / 3|| j == 0 || i == (n / 3) * 2  || j == m - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				} else {
					for (int j = 0; j < (m / 3); j++) {
						System.out.print(" ");
					}
					for (int j = (m / 3); j < (m / 3) * 2 + 1; j++) {
						if (j == (m / 3) || i == 0 || j == (m / 3) * 2 || i == n - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();

		}

	}
}