package 二维数组;

public class 二维数组排序 {
	// 二维数组排序【一个任意二维数组A中的元素是混乱的，使排序完毕后最小的元素在A[0][0]，
	// 满足任意A[m][n]>A[m-a][n-1]（m,n>=0）】
	public static void main(String[] args) {
		int[][]a = { 	{ 8, 2, 5 }, 
						{ 3, 4, 9 }, 
						{ 7, 1, 6 }, 
						};
		// 排序
				for (int i = 0; i <= a.length - 1; i++) {
					for (int j = 0; j <= a[i].length - 1; j++) {
						for (int k = 0; k <= a.length - 1; k++) {
							for (int l = 0; l <= a[i].length - 1; l++) {
								if (a[i][j] < a[k][l]) {
									int temp = a[k][l];
									a[k][l] = a[i][j];
									a[i][j] = temp;
								}
							}
						}
					}
				}
				// 输出
				for (int i = 0; i <= a.length - 1; i++) {
					for (int j = 0; j <= a[i].length - 1; j++) {
						System.out.print(a[i][j] + " ");
					}
					System.out.println();
				}
			}
		}