package 一维度数组操作;

public class 最多的值及次数 {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3 ,3,3,3,3,3};
		int sum = 0;
		int max=0;
		int s=0;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a.length - 1; j++) {
				if (a[i] == a[j]) {
					sum++;
					if (max<sum) {
						max=sum;
						s=i;
					}
				}
			}			
			sum = 0;
		}		
		System.out.println("次数最多的数是：" + a[s] + "   次数是：" + max);

	}

}
