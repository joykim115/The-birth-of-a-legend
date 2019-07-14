package 조건문;

import java.util.Scanner;

public class String비교 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 2개 입력");
		String s1 = sc.next();
		String s2 = sc.next();
		sc.nextLine();//enter - 위에 문자열 2개를 입력하며 값을 다 입력했다고 생각함 Enter 1개를 추가해 2번 입력할 수 있게함
		System.out.println("인생좌우명 입력");
		String name = sc.nextLine();	
		
		
		if(s1.equals(s2)){
		System.out.println("동일");
		}
		else {
			System.out.println("안동일");
			}

		System.out.println("입력한좌우명은:"+name);
	}
	
	
}
