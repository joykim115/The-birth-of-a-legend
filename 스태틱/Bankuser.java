package ����ƽ;

public class Bankuser {

	public static void main(String[] args) {
		bank c1 = new bank("û������", "��ƹ���", 500);
		bank c2 = new bank("�����ǰ", "���ƹ���", 30);
		bank c3 = new bank("��������", "�ھƹ���", 100);
		
		System.out.println("��ǰ��  "+ "������  "+ "���ݾ�  ");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c2.custom+"���忡��"+c2.money+"������ ����");
		System.out.println(c3.custom+"���忡��"+c3.money+"������ ����");
		
		
//		int total = bank.total;
		System.out.println("�� �Ӵ� ������ "+bank.total+"�����̿���");  // ���� ���� �ҷ�����
		System.out.println("�� ���� ������ "+bank.count+"������");
		
		
	}

}
