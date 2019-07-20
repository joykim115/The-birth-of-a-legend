package 반복문;

import java.util.Random;
import java.util.Scanner;

public class WhileTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("입력:");
			int data = sc.nextInt();
			System.out.println("확인:" + data);
		}
	}
}
