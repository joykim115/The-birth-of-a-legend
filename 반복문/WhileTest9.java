package �ݺ���;

import java.util.Scanner;

public class WhileTest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		while(true) {
		System.out.println("-------------------------");
		System.out.println("1.����, 2.���, 3.�ܰ�, 4.����");
		System.out.println("-------------------------");
		System.out.println("����>>");
		int data = sc.nextInt();
		if(data==1) {
			System.out.println("�Աݾ�:");
			int data2 = sc.nextInt();
			money = money + data2;			
			System.out.println("�ܰ�:"+money);
		}
		else if(data==2) {
			System.out.println("��ݾ�:");
			int data3 = sc.nextInt();
			money = money - data3;			
			System.out.println("�ܰ�:"+money);
		}
		else if(data==3) {
			System.out.println("�ܰ�:"+money);
		}
		else if(data==4) {
			System.out.println("�̿����ּż� �����մϴ�.");
			break;
		}
		else {
			System.out.println("���� �߸��Է��߽��ϴ�.");
	}
}
	}
}