package ��ά����;

public class ��ά�������� {
	// ��ά��������һ�������ά����A�е�Ԫ���ǻ��ҵģ�ʹ������Ϻ���С��Ԫ����A[0][0]��
	// ��������A[m][n]>A[m-a][n-1]��m,n>=0����
	public static void main(String[] args) {
		int[][]a = { 	{ 8, 2, 5 }, 
						{ 3, 4, 9 }, 
						{ 7, 1, 6 }, 
						};
		// ����
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
				// ���
				for (int i = 0; i <= a.length - 1; i++) {
					for (int j = 0; j <= a[i].length - 1; j++) {
						System.out.print(a[i][j] + " ");
					}
					System.out.println();
				}
			}
		}