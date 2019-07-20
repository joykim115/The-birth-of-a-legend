package 반복문;

import java.util.Scanner;

public class WhileTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("입력:(종료 0):");
			int data = sc.nextInt();
			if (data == 0) {
			System.out.println("프로그램 종료");
				break;// 반복문 종료
			}
			sum = data + sum;
			System.out.println("확인:"+sum);
			//sum에다가 입력값을 계속 더해보세요
			//여기까지의 sum 값을 출력			
		}
		System.out.println("최종합은"+sum);
	}	
}
