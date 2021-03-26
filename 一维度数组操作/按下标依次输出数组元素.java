package 一维度数组操作;

public class 按下标依次输出数组元素 {
	// 一个整数数组中的元素表示的含义是下一个元素的下标，
	// 请按下标依次输出这个数组的元素。（0下标开始）
	public static void main(String[] args) {
		int[] a = { 6, 4, 2, 1, 0, 3, 7, 5, 8 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			temp = a[i];
			if ((i + 1) < a.length) {
				b[temp] = a[i + 1];
			} else {
				b[temp] = a[0];
			}
		}
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j]+"  ");
		}
	}

}
