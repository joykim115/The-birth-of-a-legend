package ��������;

import java.util.Scanner;

public class ���»�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
		System.out.println("���¸� �Է�>>");
		String data1 = sc.next();
		System.out.println("������ �Է�>>");
		String data2 = sc.next();
		System.out.println("�ʱ� �Աݾ�>>");
		int data3 = sc.nextInt();
		���� a1 = new ����(data1, data2, data3);
		System.out.println(a1);
		}
	}

}
