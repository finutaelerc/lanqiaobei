package ��ֵ����;

public class ���N���ڵ����� {

		public static void main(String[] args) {
			int N=12;
			for (int i = 2; i <= N; i++) {
				boolean ss = true;
				for (int j = 2; j <= (i / 2); j++) {
					if (i % j == 0) {
						ss = false;
					}
				}
				if (ss == true) {
					System.out.print(i + " ");
				}
			}
		}
	}