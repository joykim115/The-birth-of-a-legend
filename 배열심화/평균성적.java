package �迭��ȭ;

import java.util.Scanner;

public class ��ռ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] point = new int[5];
		int sum = 0;
		for (int i = 0; i < point.length; i++) {
			System.out.println("�������Է��Ͻÿ�:");
			point[i] = sc.nextInt();
			sum = sum + point[i];
		}
		int average = sum/point.length;
		System.out.println("�����:"+average);
	}

}
