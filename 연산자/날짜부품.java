package ������;

import java.util.Date;

public class ��¥��ǰ {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();	
		System.out.println("����ð���:"+hour);
		
		// �񱳿������� ����� boolean
		// true/ false
		if(hour < 16) { //true
			System.out.println("������ �ð��� �� �����ֱ���.");
		}
		else{
			System.out.println("������ �ð��� ���� �ى籺��");
		}
	}

}
