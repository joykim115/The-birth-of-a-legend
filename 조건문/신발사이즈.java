package ���ǹ�;

import java.util.Scanner;

public class �Ź߻����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("���� �����?");
		int temp = sc.nextInt();
		System.out.print("���� ���� �򰡴�?");
		String point = sc.next();
		System.out.print("���ǽŹ߻������?");
		double size = sc.nextDouble();	
		System.out.println("������ "+temp+"��, "+"�����򰡴� "+point+", "+"�Ź��� " +size);
	}

}
