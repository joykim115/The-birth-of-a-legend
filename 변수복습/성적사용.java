package ��������;

import java.util.Scanner;

public class ������� {
	

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int sum=0;
	
		for (int i = 0; i < 5; i++) {
			System.out.print("�̸��Է�: ");
			String name = sc.next();
			System.out.print("�����Է�: ");
			int point = sc.nextInt();
			�����Է� a = new �����Է�(name, point);
			sum = point + sum;
			System.out.println(a);
		}
		System.out.println(sum);
	}

}
