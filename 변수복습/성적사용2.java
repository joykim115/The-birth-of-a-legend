package ��������;

import java.util.Scanner;

public class �������2 {
	

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int sum=0;
	
		System.out.print("�̸��Է�: ");
		String name = sc.next();
		System.out.print("�Ҽ�: ");
		String �Ҽ� = sc.next();
		for (int i = 0; i < 3; i++) {
			System.out.print("�����Է�: ");
			int point = sc.nextInt();
			sum = point + sum;
		}
		System.out.println(name+","+�Ҽ�+","+"����"+sum+","+"���"+sum/3);
	}

}
