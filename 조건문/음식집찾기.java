package 조건문;

import java.util.Scanner;

public class 음식집찾기 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("무엇을 좋아하시나요? 분식, 한식, 일식, 양식 선택");
		String food = sc.next();
		switch(food) {
		case "분식":
			System.out.println("분식집으로");
			break;
		case "한식":
			System.out.println("한식집으로");
			break;
		case "일식":
			System.out.println("일식집으로");
			break;
		case "양식":
			System.out.println("양식집으로");
		default:
		    System.out.println("집으로가요");		
		}
		
		
		
	}
}
