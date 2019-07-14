package 조건문;

import java.util.Scanner;

public class 영수증출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("받은돈은 얼만가요? : ");
		int money = sc.nextInt();
		System.out.print("상품의 가격은 얼만가요? : ");
		int price = sc.nextInt();
		int change = money - price;
		double tax = price * 0.1;
		if(money > price) {
			System.out.println("잔돈은 "+change+"입니다");
		}
		else if (money==price) {
			System.out.println("잔돈이 없습니다");
		}
			
		else {
			System.out.println("돈이 부족합니다.");
		}
		System.out.println("부가가치세는 "+(int)tax+"입니다");
		
	}
}
