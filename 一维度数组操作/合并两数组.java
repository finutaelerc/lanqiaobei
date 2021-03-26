package 一维度数组操作;

public class 合并两数组 {
	public static void main(String[] args) {
		int[] a = { 1, 5, 6 };
		int[] b = { 1, 2, 3 };
		int[] c = new int[6];

		for (int i = 0; i < b.length; i++) {
			c[i] = a[i];
			boolean ss = true;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					ss = false;
					break;
				}
			}
			if (ss) {
				c[i + 3] = b[i];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
