package ������;

import java.util.Date;

public class ���̰��2 {

	public static void main(String[] args) {
		int year = 2000;
		
		Date date = new Date();
		int thisYear = date.getYear() + 1900;
		// �з��Ͼ� ���� ������ 1900�� ������ߵ� (�ڵ����� 1900�⵵ ���� ����)
		
		int age = thisYear - year + 1;
		System.out.println("���ǳ��̴�:"+age);

	}

}
