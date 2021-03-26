package 一维度数组操作;

public class 求连续N个相邻的和 {
	// 在一个整数数组中，求连续N个相邻的和最大的值
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int n = 3;
		int sum = 0, max = 0;
		;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= a.length - 1) {
					sum = sum + a[i + j];
					if (max < sum) {
						max = sum;
					}
				}
			}
			sum = 0;
		}
		System.out.println(max);
	}

}
