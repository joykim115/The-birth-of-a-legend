package ���ǹ�;

import java.util.Scanner;

public class �԰�������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�԰������ �Է��ϱ�");
		System.out.print("1�� ¥��, 2�� «��, 3��  ����, 4�� ����");
		int food = sc.nextInt();
		switch(food) {  //��츦 ������ ����� ǥ��
		case 1:
			System.out.println("¥���� �Ծ��");
			break;
		case 2:
			System.out.println("«���� �Ծ��");
			break;// ����ġ���� ������ ������ ���� �극��ũ�� ���� �޾������
		case 3:
			System.out.println("������ �Ծ��");
			break;
		case 4:
			System.out.println("������ �Ծ��");
			break;
		default: // if���� else�� ����
			System.out.println("�ȸԾ��");
			break;
	}
}
}
