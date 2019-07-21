package 배열심화;

import java.util.Scanner;

public class 평균성적 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] point = new int[5];
		int sum = 0;
		for (int i = 0; i < point.length; i++) {
			System.out.println("성적을입력하시오:");
			point[i] = sc.nextInt();
			sum = sum + point[i];
		}
		int average = sum/point.length;
		System.out.println("평균은:"+average);
	}

}
