package 반복문;

import java.util.Scanner;

public class WhileTest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		while(true) {
		System.out.println("-------------------------");
		System.out.println("1.예금, 2.출금, 3.잔고, 4.종료");
		System.out.println("-------------------------");
		System.out.println("선택>>");
		int data = sc.nextInt();
		if(data==1) {
			System.out.println("입금액:");
			int data2 = sc.nextInt();
			money = money + data2;			
			System.out.println("잔고:"+money);
		}
		else if(data==2) {
			System.out.println("출금액:");
			int data3 = sc.nextInt();
			money = money - data3;			
			System.out.println("잔고:"+money);
		}
		else if(data==3) {
			System.out.println("잔고:"+money);
		}
		else if(data==4) {
			System.out.println("이용해주셔서 감사합니다.");
			break;
		}
		else {
			System.out.println("값을 잘못입력했습니다.");
	}
}
	}
}