package 一维度数组操作;

public class 奇数偶数换位置 {
	// 在一个整数数组中，所有基数位和偶数位置上的元素交换位置。(0和1换，2和3换....)
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13 };
		int[] b = new int[a.length];
		for (int i = 0; i <= a.length - 1; i++) {
			if (i % 2 == 0) {
				if (i + 1 <=a.length - 1) {
					b[i] = a[i + 1];
					b[i + 1] = a[i];
				} else {
					b[i] = a[i];
				}

			}
		}
		for (int j = 0; j <=a.length - 1; j++) {
			System.out.print(b[j] + " ");
		}
	}

}
