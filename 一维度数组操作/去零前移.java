package 一维度数组操作;

public class 去零前移 {
	// 数组中有一些0元素，这个叫做"磁盘碎片"，磁盘碎片整理程序会去掉这些0元素，
	// 同时后面的元素前移；求一个数组进行碎片整理之后的最后结果。
	public static void main(String[] args) {
		int[] a = { 0, 2, 0, 1, 0, 0, 3, 4, };
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a.length; k++) {
				if (a[i] == 0) {
					for (int j = i; j <= a.length - 1-1; j++) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
		}
		for (int e = 0; e < a.length; e++) {
			// if (e == a.length - 1) {
			//
			// } else {
			// System.out.print(a[e] + " ");
			// }
			System.out.print(a[e] + " ");
		}
	}

}
