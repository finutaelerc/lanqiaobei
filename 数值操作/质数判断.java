package ��ֵ����;

public class �����ж� {
	public static void main(String[] args) {
		int shu = 11;
		if (shu <= 0) {
			System.out.println("�Բ���������Ĳ�����Ȼ����");
			return;
		}
		boolean pan = true;
		for (int i = 2; i <= shu / 2; i++) {
			if (shu % i == 0) {
				pan = false;
				break;
			}
		}
		System.out.println(shu + "��������" + pan);
	}
}