package ���ǹ�;

import java.util.Scanner;

public class �����޼� {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		// Scanner Ű���忡�� �о�� ���� ��ǻ�Ͱ� �νĽ��� �ִ� ���
		System.out.print("���� �Է�:");
		int money = sc.nextInt();// next() ���α׷� �������ڸ��� �ֿܼ��� �Է� ������� ����
		
		if(money >= 1000) {
			System.out.println("����!! �����޼�");
			double bonus = money * 0.2;
			System.out.println("����� ���ʽ���"+(int)bonus+"�鸸��"); //��������ȯ(double->int���� ��°� �տ� ()�� ǥ��)
		}
		else{
			System.out.println("��Ÿ���׿�!! �����̴޼�");
			}
}
}
