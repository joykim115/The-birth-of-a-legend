package ���ǹ�;

import java.util.Date;

public class ���ǹ�2 {  // else if ���� if - else if - else�� ����
	public static void main(String[] args) {
		
		//��Ʈ��+����Ʈ+���� o ������ ����Ʈ ���� â�� ��� �� ����, �ڵ� ����Ʈ
		Date date = new Date();
		int hour = date.getHours();//����ð�
		
		if (hour <= 11) {
			System.out.println("�¸��");
		}
		else if(hour <= 15) {
			System.out.println("�¿����ʹ�");
		}
		else if (hour <= 20) {
			System.out.println("���̺��");
		}
		else {
			System.out.println("�³���");
		}
	}
}

