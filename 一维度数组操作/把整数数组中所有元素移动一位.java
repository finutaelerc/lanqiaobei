package һά���������;

public class ����������������Ԫ���ƶ�һλ {
	public static void main(String[] args) {
//		 ����������������Ԫ���� �� �ƶ�һλ
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			if ((i + 1) < a.length) {
				a[i] = a[i + 1];
			} else {
				a[i] = 0;
			}
		}
		for (int j = 0; j <= a.length - 1; j++) {
			System.out.print(a[j] + " ");
		}
//		 ����������������Ԫ���� �� �ƶ�һλ
		System.out.println();
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int k = b.length - 1; k >= 0; k--) {
			if (k - 1 >= 0) {
				b[k] = b[k - 1];
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
