package 数值操作;

public class 质数判断 {
	public static void main(String[] args) {
		int shu = 11;
		if (shu <= 0) {
			System.out.println("对不起，你输入的不是自然数！");
			return;
		}
		boolean pan = true;
		for (int i = 2; i <= shu / 2; i++) {
			if (shu % i == 0) {
				pan = false;
				break;
			}
		}
		System.out.println(shu + "是质数？" + pan);
	}
}