package 반복문;

import java.util.Random;
import java.util.Scanner;

public class WhileTest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 100;
		while(true){
		System.out.println("-----------------------");
		System.out.println("1.증속, 2.감속, 3.중지");
		System.out.println("-----------------------");
		System.out.print("선택>>>");
		int data = sc.nextInt();
		if(data==1) {
			System.out.print("증감 숫자입력>>>");
			int data2 = sc.nextInt();
			speed = speed+data2;
			System.out.println("현재 속도는:"+speed+"입니다");
		}
		else if(data==2) {
			System.out.print("증감 숫자입력>>>");
			int data3 = sc.nextInt();
			speed = speed-data3;
			System.out.println("현재 속도는:"+speed+"입니다");	
		}
		else if(data==3) {
			System.out.println("멈춥니다요");	
			break;
		}
		else {
			System.out.println("잘못입력하신거 같은디요?");	
		}	
		}
	}
}
