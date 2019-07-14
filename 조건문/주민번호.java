package 조건문;

import java.util.Scanner;

public class 주민번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력(-제외)");
		String sn = sc.next();
		
		char gender = sn.charAt(6); 
		//charAT(위치값) : String에서 char 1글짜를 추출할때 사용.
		//프로그래밍은 숫자를 샐때 1번부터 새는게 아니라 0번부터 시작
		System.out.println(gender);
		switch (gender) {
		case '1': case '3':
			System.out.println("남");
			break;
		case '2': case '4':
			System.out.println("여");
			break;
		default:
			break;
		}
	}

}
