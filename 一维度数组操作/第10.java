package һά���������;

public class ��10 {
//	10.��һ�������У��±�ΪN��Ԫ�غ�������Ԫ��������Ԫ�ص�ֵ���±ꡣ��������Nλ�ã�
	public static void main(String[] args) {
		int[] a = { 9, 1, 2, 3, 71, 4, 8,5, 6  };
		int n=4;
		int max=0;
		int v=0;
		for (int i = (n+1); i < a.length; i++) {
			if (max<a[i]) {
				max=a[i];
				v=i;
			}
		}
		System.out.println(max+" "+v);
		
	}

}
