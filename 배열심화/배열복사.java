package �迭��ȭ;

import java.util.Arrays;

public class �迭���� {

	public static void main(String[] args) {
		// �������� - ���� ���� ���� ����
		int n1 = 100;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		n1 = 200;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("-------------");

		// �迭�� ���� - ���� ���� �ּҰ��� ����
		int[] n3 = { 1, 2 };
		int[] n4 = n3;
		for (int i : n3) {
			System.out.println(i);
		}
		for (int i : n4) {
			System.out.println(i);
		}
		n3[0] = 99;
		for (int i : n3) {
			System.out.println(i);
		}
		for (int i : n4) {
			System.out.println(i);
		}
		// �迭�� ���� - ���� ���� ���� ���� ���� ����
		System.out.println("-------------");
		int[] n5 = { 1, 2 };
		int[] n6 = n5.clone();
		;// ���� ���縦 ���� ��ɾ� clone
		n5[0] = 99;
		for (int i : n5) {
			System.out.println(i);
		}
		for (int i : n6) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// �����ϴ¹�
		int[] n7 = { 44, 55, 234, 432, 643 };
		Arrays.sort(n7);
		for (int i : n7) {
			System.out.println(i);
		}
	}

}
