package �迭;

import java.util.Scanner;

public class �迭6 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println("�����Է�");
			int data = sc.nextInt();
			jumsu[i] = data;
		}
		
		
		System.out.println("�������");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
	}
}
