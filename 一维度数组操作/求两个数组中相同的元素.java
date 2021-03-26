package 一维度数组操作;

public class 求两个数组中相同的元素 {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		int[] b={11,22,3,44,5,66,7,88,9};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
		
	}

}
