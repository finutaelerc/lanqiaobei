package ͼ�����;

public class �߳�ΪN���������� {
	public static void main(String[] args) {
		int N=6;
		for (int i = 1; i <=N+2; i++) {
			for (int j = 1; j <=N+2.; j++) {
				if (i!=1&&i!=N+2&&j>1&&j<N+2) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
//				System.out.print("*");
			}
			System.out.println();
		}
	}

}
