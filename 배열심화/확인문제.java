package �迭��ȭ;

import java.util.Scanner;

public class Ȯ�ι��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = null;
		int point = 0;

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("-------------------------------------");
			System.out.print("����>>");
			int data = sc.nextInt();
			if (data == 1) {
				System.out.println("�л���: ");
				int data2 =sc.nextInt();
				scores = new int[data2];
				System.out.println("");
			} else if (data == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("����");
					scores[i] = sc.nextInt();
				}
			} else if (data == 3) {
				for (int j = 0; j < scores.length; j++) {
					System.out.println(scores[j]);
				}
			} else if (data == 4) {
				for (int j = 0; j < scores.length; j++) {
					point = point + scores[j];
				}
				System.out.println("�հ��" + point);
				int average = point / scores.length;
				System.out.println("�����" + average);
			} else if (data == 5) {
				System.out.println("good bye~~");
				break;
			} else {
				System.out.println("��ȣ�� �߸������̽��ϴ�.");
				break;
			}
		}
	}
}
