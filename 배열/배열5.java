package 배열;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		int[] eng = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < eng.length; i++) {
			System.out.println("점수입력");
			int data = sc.nextInt();
			eng[i] = data;
		}
		//0점 처리
		eng[2] = 0;
				
		System.out.println("점수출력");
		for (int i = 0; i < eng.length; i++) {
			System.out.println(eng[i]);
		}
		
	}
}
