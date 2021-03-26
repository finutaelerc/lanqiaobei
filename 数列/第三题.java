package 数列;

public class 第三题 {
	public static void main(String[] args) {
//		1-(2-(3-(4-(5-(n)))))
//		1-(2-(3));
//		int n=6;
//		int sum=0;
//		
//		for (int i = n; i >=1; i--) {
//			sum=i-sum;
//		}
//		System.out.println(sum);
		System.out.println(ssd(6));
	}
	public static int ssd(int x){
		if (x == 1) {
			return 1;
		} else {
			return x - ssd(x-1);
		}
	}

}
