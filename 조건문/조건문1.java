package ���ǹ�;

import java.util.Date;

public class ���ǹ�1 {
	public static void main(String[] args) {
		
		//��Ʈ��+����Ʈ+���� o ������ ����Ʈ ���� â�� ��� �� ����, �ڵ� ����Ʈ
		Date date = new Date();
		int hour = date.getHours();//����ð�
		
		if (hour <= 12) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
}

