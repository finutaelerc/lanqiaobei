package 一维度数组操作;

public class 第10 {
//	10.求一个数组中，下标为N的元素后面所有元素中最大的元素的值和下标。（不包括N位置）
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
