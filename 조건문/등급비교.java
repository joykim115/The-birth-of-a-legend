package ���ǹ�;

import java.util.Scanner;

public class ��޺� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����� ��� �ǽó���?");
		String sn = sc.next();
		
		char grade = sn.charAt(0);
		
		switch(grade) {
		case 'A':
			System.out.println("�ֿ���Դϴ�.");
			break;
		case 'B':
			System.out.println("����Դϴ�.");
			break;
		case 'C':
			System.out.println("�Ϲ��Դϴ�.");
			break;
		default:
			System.out.println("�ƹ�����Դϴ�.");
		
		}

	}

}
