package һά���������;

public class ���������� {
//	һ���������Ǿֲ������ģ���������������������
	public static void main(String[] args) {
		int[] a={1,5,2,1,2,3,4,2};
		int sum=0,max=0;
		int summ=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {				
				max=a[i];
				sum++;
			}else {
				max=0;sum=0;
				if (a[i]>=max) {
					max=a[i];	
					sum++;
				}
			}
			if (summ<sum) {
				summ=sum;
			}
		}
		System.out.println("������������������:"+summ);
	}

}
