package ���ǹ�;

import java.util.Scanner;

public class String�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� 2�� �Է�");
		String s1 = sc.next();
		String s2 = sc.next();
		sc.nextLine();//enter - ���� ���ڿ� 2���� �Է��ϸ� ���� �� �Է��ߴٰ� ������ Enter 1���� �߰��� 2�� �Է��� �� �ְ���
		System.out.println("�λ��¿�� �Է�");
		String name = sc.nextLine();	
		
		
		if(s1.equals(s2)){
		System.out.println("����");
		}
		else {
			System.out.println("�ȵ���");
			}

		System.out.println("�Է����¿����:"+name);
	}
	
	
}
