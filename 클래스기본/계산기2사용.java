package Ŭ�����⺻;

public class ����2��� {

	public static void main(String[] args) {
		����2 cal = new ����2();
		//5��, 5000��=25000��
		//2000�� �̻��̸� ����.
		int total=cal.mul(5, 5000);
		if (total>=20000) {
			System.out.println("��������ұݾ���"+(total-2000));
		}
		else {
			System.out.println("����� ���ұݾ���"+total);
		}
	}

}
