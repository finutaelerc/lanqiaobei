package һά���������;

public class ȥ��ǰ�� {
	// ��������һЩ0Ԫ�أ��������"������Ƭ"��������Ƭ��������ȥ����Щ0Ԫ�أ�
	// ͬʱ�����Ԫ��ǰ�ƣ���һ�����������Ƭ����֮����������
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
