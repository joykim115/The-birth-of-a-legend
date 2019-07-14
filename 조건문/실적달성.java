package 조건문;

import java.util.Scanner;

public class 실적달성 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		// Scanner 키보드에서 읽어온 값을 컴퓨터가 인식시켜 주는 기능
		System.out.print("실적 입력:");
		int money = sc.nextInt();// next() 프로그램 실행하자마자 콘솔에서 입력 받으라는 뜯임
		
		if(money >= 1000) {
			System.out.println("축하!! 실적달성");
			double bonus = money * 0.2;
			System.out.println("당신의 보너스는"+(int)bonus+"백만원"); //강제형변환(double->int변경 출력값 앞에 ()로 표현)
		}
		else{
			System.out.println("안타깝네요!! 실적미달성");
			}
}
}
