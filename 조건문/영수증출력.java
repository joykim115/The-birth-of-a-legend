package ���ǹ�;

import java.util.Scanner;

public class ��������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �󸸰���? : ");
		int money = sc.nextInt();
		System.out.print("��ǰ�� ������ �󸸰���? : ");
		int price = sc.nextInt();
		int change = money - price;
		double tax = price * 0.1;
		if(money > price) {
			System.out.println("�ܵ��� "+change+"�Դϴ�");
		}
		else if (money==price) {
			System.out.println("�ܵ��� �����ϴ�");
		}
			
		else {
			System.out.println("���� �����մϴ�.");
		}
		System.out.println("�ΰ���ġ���� "+(int)tax+"�Դϴ�");
		
	}
}
