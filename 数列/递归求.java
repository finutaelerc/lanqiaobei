package ����;

public class �ݹ��� {
	// �ݹ���1+2+3+...+n
	public static void main(String[] args) {
		int sum = sdg(5);
		System.out.println(sum);
	}
	public static int sdg(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x + sdg(x - 1);
		}
	}
}
