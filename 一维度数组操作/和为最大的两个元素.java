package һά���������;

public class ��Ϊ��������Ԫ�� {
	// ��һ�����������У�����������Ԫ��
	public static void main(String[] args) {
		int[] a = { 9, 1, 2, 3, 4, 5, 6, 71, 8 };
		int sum = 0;
		int max=0;
		int q=0,w=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				sum = a[i] + a[j];
				if (max<sum) {
					max=sum;
					q=i;w=j;
				}
				sum=0;
			}
		}
		System.out.println(a[q]+" "+a[w]);
	}

}
