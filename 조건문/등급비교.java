package 조건문;

import java.util.Scanner;

public class 등급비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 등급은 어떻게 되시나요?");
		String sn = sc.next();
		
		char grade = sn.charAt(0);
		
		switch(grade) {
		case 'A':
			System.out.println("최우수입니다.");
			break;
		case 'B':
			System.out.println("우수입니다.");
			break;
		case 'C':
			System.out.println("일반입니다.");
			break;
		default:
			System.out.println("아무등급입니다.");
		
		}

	}

}
