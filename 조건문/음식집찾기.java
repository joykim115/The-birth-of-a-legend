package ���ǹ�;

import java.util.Scanner;

public class ������ã�� {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("������ �����Ͻó���? �н�, �ѽ�, �Ͻ�, ��� ����");
		String food = sc.next();
		switch(food) {
		case "�н�":
			System.out.println("�н�������");
			break;
		case "�ѽ�":
			System.out.println("�ѽ�������");
			break;
		case "�Ͻ�":
			System.out.println("�Ͻ�������");
			break;
		case "���":
			System.out.println("���������");
		default:
		    System.out.println("�����ΰ���");		
		}
		
		
		
	}
}
