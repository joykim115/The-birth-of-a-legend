package �迭;

import java.util.Scanner;

public class �迭8 {
	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		
		while (true) {
			System.out.println("--------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + "");
			}
			System.out.println();
			System.out.println("--------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "");
			}
			System.out.println();
			System.out.println("���Ź�ȣ�Է�:");
			int data = sc.nextInt();
			System.out.println();

			if (data >= 0) {
				if (seat[data] == 0) {
					seat[data] = 1;
					count++;
				} else {
					System.out.println("�ٽü������ּ���");
				}
			} else {
				System.out.println("�ٽü������ּ���");
			} // else
		} // while
	}// main
}// class
