package 배열;

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println("점수입력");
			int data = sc.nextInt();
			jumsu[i] = data;
		}
		
		
		System.out.println("점수출력");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
	}
}
