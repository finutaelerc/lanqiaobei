package 数列;

public class 第四题 {
	public static void main(String[] args) {
//		n-((n-1)-...-(5-(4-(3-(2-1)))))
//		3-(2-(1))
		int n=3;
		int sum=0;
		for (int i = 1; i <=n; i++) {
			sum=i-sum;
			
		}
		System.out.print(sum);
		
	}

}
