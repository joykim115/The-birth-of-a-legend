package 배열심화;

import java.util.Arrays;

public class 배열복사 {

	public static void main(String[] args) {
		// 변수복사 - 실제 내부 값을 복사
		int n1 = 100;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		n1 = 200;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("-------------");

		// 배열의 복사 - 얕은 복사 주소값만 복사
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
		// 배열의 복사 - 깊은 복사 실제 내부 값을 복사
		System.out.println("-------------");
		int[] n5 = { 1, 2 };
		int[] n6 = n5.clone();
		;// 깊은 복사를 위한 명령어 clone
		n5[0] = 99;
		for (int i : n5) {
			System.out.println(i);
		}
		for (int i : n6) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// 정렬하는법
		int[] n7 = { 44, 55, 234, 432, 643 };
		Arrays.sort(n7);
		for (int i : n7) {
			System.out.println(i);
		}
	}

}
