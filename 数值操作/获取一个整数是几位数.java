package ��ֵ����;

public class ��ȡһ�������Ǽ�λ�� {
	public static void main(String[] args) {
		int a = 100000;
		int b = 10;
		int s = 0;
		for (int i = 1; i > 0; i++) {
			if (a >= 10) {
				a = a / b;
				s++;
			} else {
				break;
			}
		}
		System.out.println(s+1);
		int aa=(int)Math.pow( 10,3) ;
		System.out.println(aa);
	}

}
