package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class WhileTest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 100;
		while(true){
		System.out.println("-----------------------");
		System.out.println("1.����, 2.����, 3.����");
		System.out.println("-----------------------");
		System.out.print("����>>>");
		int data = sc.nextInt();
		if(data==1) {
			System.out.print("���� �����Է�>>>");
			int data2 = sc.nextInt();
			speed = speed+data2;
			System.out.println("���� �ӵ���:"+speed+"�Դϴ�");
		}
		else if(data==2) {
			System.out.print("���� �����Է�>>>");
			int data3 = sc.nextInt();
			speed = speed-data3;
			System.out.println("���� �ӵ���:"+speed+"�Դϴ�");	
		}
		else if(data==3) {
			System.out.println("����ϴٿ�");	
			break;
		}
		else {
			System.out.println("�߸��Է��ϽŰ� �������?");	
		}	
		}
	}
}
