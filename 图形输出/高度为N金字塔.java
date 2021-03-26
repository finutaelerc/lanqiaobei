package 图形输出;

public class 高度为N金字塔 {
	public static void main(String[] args) {
		int N=3;
		for (int i = 1; i <=N; i++) {
			for (int k = N-i; k >0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
