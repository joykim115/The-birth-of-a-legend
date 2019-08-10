package 배열제어;

import java.util.Scanner;

public class 배열제어심화2 {

	public static void main(String[] args) {
		// 배열은 자동 초기화
		int[][] seat2 = new int[10][10]; // 행, 열
		System.out.print("  ");
		Scanner sc = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < seat2.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n--------------------");// \n=엔터

			for (int i = 0; i < seat2.length; i++) {// 행 먼저 만들기
				System.out.print(i + "-");
				for (int j = 0; j < seat2[i].length; j++) {// 열 만들기
					System.out.print(seat2[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("행입력(-1종료): ");
			int row = sc.nextInt();
			if (row == -1) {
				System.out.println("예약을종료합니다.");
				break;
			}
			System.out.println("열입력: ");
			int col = sc.nextInt();
			if (seat2[row][col] != 1) {
				seat2[row][col] = 1;
				System.out.println("예약완료되었습니다.");
			} else {
				System.out.println("다른자리선택해주세요");
			}
		}
	}
}
