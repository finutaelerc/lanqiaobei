package һά���������;

public class ������ȱʧ��Ԫ�� {
//	һ������ֻ��0...9��ʮ��Ԫ����ɣ�������������ȱʧ��Ԫ��
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		int[] b={1,6,8};
		for (int i = 0; i <=a.length-1; i++) {
			boolean ss=true;
			for (int j = 0; j <=b.length-1; j++) {
				if (a[i]==b[j]) {
					ss=false;
					break;
				}
			}
			if (ss) {
				System.out.print(a[i]+"  ");
			}
		}
		
	}

}
