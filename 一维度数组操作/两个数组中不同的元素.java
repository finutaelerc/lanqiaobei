package һά���������;

public class ���������в�ͬ��Ԫ�� {
	public static void main(String[] args) {
//		int[] a={1,5,6};
//		int[] b={1,2,3};
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 11, 22, 3, 44, 5, 66, 7, 88, 9 };
		// for (int i = 0; i <=a.length-b.length; i++) {
		// boolean ss=true;
		// for (int j = 0; j <=b.length-1; j++) {
		// if (b[j]!=a[i+j]) {
		// ss=false;
		// break;
		// }
		// }
		// if (ss) {
		// System.out.println("�ڵ�"+(i+1)+"��λ����ƥ��ɹ�!!");
		// return;
		// }
		// }
		for (int i = 0; i <=a.length-1; i++) {
			boolean ss = true;
			for (int j = 0; j <=b.length-1; j++) {
				if (a[i]== b[j]) {
					ss = false;
					break;
				}
			}
			if (ss) {
				System.out.print(a[i]+"��");
//				return;
			}
		}

	}

}
