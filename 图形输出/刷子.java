package 图形输出;

public class 刷子 {
	// 宽度为N，高度为M的刷子:
	// ****
	// ****
	// ****
	// ****
	// ****
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
