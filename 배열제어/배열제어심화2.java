package �迭����;

import java.util.Scanner;

public class �迭�����ȭ2 {

	public static void main(String[] args) {
		// �迭�� �ڵ� �ʱ�ȭ
		int[][] seat2 = new int[10][10]; // ��, ��
		System.out.print("  ");
		Scanner sc = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < seat2.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n--------------------");// \n=����

			for (int i = 0; i < seat2.length; i++) {// �� ���� �����
				System.out.print(i + "-");
				for (int j = 0; j < seat2[i].length; j++) {// �� �����
					System.out.print(seat2[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("���Է�(-1����): ");
			int row = sc.nextInt();
			if (row == -1) {
				System.out.println("�����������մϴ�.");
				break;
			}
			System.out.println("���Է�: ");
			int col = sc.nextInt();
			if (seat2[row][col] != 1) {
				seat2[row][col] = 1;
				System.out.println("����Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�ٸ��ڸ��������ּ���");
			}
		}
	}
}
