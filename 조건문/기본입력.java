package 조건문;

import java.util.Scanner;

public class 기본입력 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		// Scanner 키보드에서 읽어온 값을 컴퓨터가 인식시켜 주는 기능
		System.out.print("프로그램 이름 입력:");
		String data = sc.next();// next() 프로그램 실행하자마자 콘솔에서 입력 받으라는 뜯임
		System.out.println("입력값:"+data); // 입력된 값을 다시 출력해줌
		
	}

}
