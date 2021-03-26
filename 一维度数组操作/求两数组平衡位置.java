package 一维度数组操作;

public class 求两数组平衡位置 {
	// 求一个整数数组的平衡位置。（这个元素两边的和相等）
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i - 1; j >= 0; j--) {
				sum1 = sum1 + a[j];
			}
			// System.out.print("sum1=" + sum1 + " ");
			for (int j = i + 1; j < a.length; j++) {
				sum2 = sum2 + a[j];
			}
			// System.out.print("sum2=" + sum2);
			// System.out.println();
			if (sum1 == sum2) {
				System.out.println(a[i]);
			}
			sum1 = 0;
			sum2 = 0;
		}
	}
}
