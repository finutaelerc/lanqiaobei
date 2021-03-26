package 图形输出;

public class 打印信纸 {
//	利用制表符号打印如下N列M行的信纸：
//	 ┌───────────────┐
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 │───────────────│
//	 └───────────────┘
	public static void main(String[] args) {
		int lie=15;
		int hang=20;
		System.out.print("┌");
		for (int m = 0; m <lie-1; m++) {
			System.out.print("─");
		}
		System.out.println("┐");
		for (int i = 0; i <hang; i++) {			
			for (int j = 0; j <=lie; j++) {
				if (j==0) {
					System.out.print("│");
				}else if (j==lie) {
					System.out.print("│");
				}else {
					System.out.print("─");
				}
			}
			System.out.println();
		}
		System.out.print("└");
		for (int m = 0; m <lie-1; m++) {
			System.out.print("─");
		}
		System.out.println("┘");
		
	}

}
