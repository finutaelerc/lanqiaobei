package һά���������;

public class ����ż����λ�� {
	// ��һ�����������У����л���λ��ż��λ���ϵ�Ԫ�ؽ���λ�á�(0��1����2��3��....)
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
