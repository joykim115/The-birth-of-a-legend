package 배열심화;

import java.util.Scanner;

public class 확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = null;
		int point = 0;

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>>");
			int data = sc.nextInt();
			if (data == 1) {
				System.out.println("학생수: ");
				int data2 =sc.nextInt();
				scores = new int[data2];
				System.out.println("");
			} else if (data == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수");
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
				System.out.println("합계는" + point);
				int average = point / scores.length;
				System.out.println("평균은" + average);
			} else if (data == 5) {
				System.out.println("good bye~~");
				break;
			} else {
				System.out.println("번호를 잘못누르셨습니다.");
				break;
			}
		}
	}
}
