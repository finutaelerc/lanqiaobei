package 一维度数组操作;

public class 数组的模式匹配 {
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
				System.out.println("数组B 是  数组A的子数组");
			    return;
			}
		}
		System.out.println("数组B  不是  数组A的子数组");
	}

}

	