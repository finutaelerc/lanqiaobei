package һά���������;

public class ���±������������Ԫ�� {
	// һ�����������е�Ԫ�ر�ʾ�ĺ�������һ��Ԫ�ص��±꣬
	// �밴�±����������������Ԫ�ء���0�±꿪ʼ��
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
