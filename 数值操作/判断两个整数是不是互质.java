package ��ֵ����;

public class �ж����������ǲ��ǻ��� {
//	�������Լ��Ϊ1
	public static void main(String[] args) {
		
		int a = 6;
		int b = 7;
		if (a >= b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (a != 0) {
			int temp = b % a;
			b = a;
			a = temp;
		}
		if (b == 1) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
	}
}