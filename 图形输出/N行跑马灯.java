package 图形输出;

public class N行跑马灯 {
	// 123456789
	// 234567891
	// 345678912
	// 456789123
	// ...
	// 912345678
	// 891234567
	// ...
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int N = 11;
		for (int i = 0; i <=N; i++) {
			for (int j = 0; j <=a.length-1; j++) {
				System.out.print(a[j]);
			}
			int p=a[0];
			for (int j = 0; j <=a.length-1-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=p;		
			System.out.println();	
			}
		
		}
	}
