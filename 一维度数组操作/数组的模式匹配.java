package һά���������;

public class �����ģʽƥ�� {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = { 5, 6, 7, 8 };
		for (int i = 0; i <=a.length-b.length; i++) {
			boolean ss=true;
			for (int j = 0; j <=b.length-1; j++) {
			  if (b[j]!=a[i+j]) {
				ss=false;
				break;
			}
		}	
			if (ss) {
				System.out.println("����B ��  ����A��������");
			    return;
			}
		}
		System.out.println("����B  ����  ����A��������");
	}

}

	