package ����ƽ;

public class companyuser {
	int a;  // class �ȿ��� �ڵ� �ʱ�ȭ
	
	public static void main(String[] args) {
		company a1 = new company("ȫ�浿", 25, '��');
		company a2 = new company("��浿", 23, '��');
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("��ճ���"+company.average+"�Դϴ�.");
		System.out.println("������"+company.count+"�Դϴ�.");
		
		int b = 0;  // �޼ҵ�(void) �ȿ��� �ʱ�ȭ �ȵ�
		System.out.println(b);
		
	}
}
