package 조건문;

import java.util.Scanner;

public class 먹고싶은음식 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고싶은거 입력하기");
		System.out.print("1번 짜장, 2번 짬뽕, 3번  감자, 4번 만두");
		int food = sc.nextInt();
		switch(food) {  //경우를 설정해 결과를 표출
		case 1:
			System.out.println("짜장을 먹어요");
			break;
		case 2:
			System.out.println("짬뽕을 먹어요");
			break;// 스위치문은 스스로 멈추지 못해 브레이크를 전부 달아줘야함
		case 3:
			System.out.println("감자을 먹어요");
			break;
		case 4:
			System.out.println("만두을 먹어요");
			break;
		default: // if문의 else의 역할
			System.out.println("안먹어요");
			break;
	}
}
}
