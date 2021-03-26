package 一维度数组操作;

public class 移动N位 {
	// 把整数数组中所有元素向 左 移动N位
	public static void main(String[] args) {
//		移动p位
		int p=5;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			if ((i + p) < a.length) {
				a[i] = a[i + p];
			} else {
				a[i] = 0;
			}
		}
		for (int j = 0; j <= a.length - 1; j++) {
			System.out.print(a[j] + " ");
		}
//		 把整数数组中所有元素向 右 移动N位
		System.out.println();
//		移动r位
		int r=3;
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int k = b.length - 1; k >= 0; k--) {
			if (k - r >= 0) {
				b[k] = b[k - r];
			} else {
				b[k] = 0;
			}
//			System.out.print(b[k] + " ");
		}
		 for (int j = 0; j <= b.length - 1; j++) {
		 System.out.print(b[j] + " ");
		 }
	}

}
