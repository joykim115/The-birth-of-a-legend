package �ݺ���;

import java.util.Scanner;

public class WhileTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("�Է�:(���� 0):");
			int data = sc.nextInt();
			if (data == 0) {
			System.out.println("���α׷� ����");
				break;// �ݺ��� ����
			}
			sum = data + sum;
			System.out.println("Ȯ��:"+sum);
			//sum���ٰ� �Է°��� ��� ���غ�����
			//��������� sum ���� ���			
		}
		System.out.println("��������"+sum);
	}	
}
