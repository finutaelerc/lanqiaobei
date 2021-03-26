package 图形输出;

public class N行跑马灯 {
	// 123456789
	// 234567891
	// 345678912
	// 456789123
	// ...
	// 912345678
	// 891234567
	// ...
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int N = 11;
		for (int i = 0; i < N; i++) {
			if (i < a.length) {
				for (int j = i; j < a.length; j++) {
					System.out.print(a[j]);
				}
				for (int r = 0; r < i; r++) {
					System.out.print(a[r]);
				}
				System.out.println();
			} else {				
					for (int j = 7; j < a.length; j++) {
						System.out.print(a[j]);
					}
					for (int k = 0; k < 7; k++) {
						System.out.print(a[k]);
					}
					System.out.println();
				}
			}
		}
	}
