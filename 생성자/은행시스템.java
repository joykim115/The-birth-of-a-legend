package ������;

import java.util.Scanner;

public class ����ý��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = null;//Account A�� �̸� �����ؾ� ��� ��� ����, �޸� Ȯ��
		while (true) {//���ѷ���
			System.out.println("-----------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����|");
			System.out.println("-----------------------------------");
			System.out.print("����>>");
			int input = sc.nextInt();			
			if (input == 1) { // ���»���
				System.out.println("------"); 
				System.out.println("���»���"); 
				System.out.println("------");
				System.out.println("���¹�ȣ�Է�:");
				String data1 = sc.next();
				System.out.println("��������:");
				String data2 = sc.next();
				System.out.println("�Աݾ�:");
				int data3 = sc.nextInt();
				a = new Account(data1, data2, data3);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");				
			}
			else if (input == 2) {//���¸��
				System.out.println(a);
				//toString �żҵ� ����				
			}
			else if (input == 3) {//����
				System.out.println("���ݾ�:");
				int data4 = sc.nextInt();
				a.total = a.total + data4;
				System.out.println("����ݾ�:"+ a.total +"��");
			}			
			else if (input == 4) {//���
				int data5 = sc.nextInt();
				a.total = a.total - data5;
				System.out.println("����ݾ�:"+ a.total +"��");
			}			
			else { // 5�϶� ����
				System.out.println("byebye~");
				break;
			}
		}
	}

}
