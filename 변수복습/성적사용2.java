package 변수복습;

import java.util.Scanner;

public class 성적사용2 {
	

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int sum=0;
	
		System.out.print("이름입력: ");
		String name = sc.next();
		System.out.print("소속: ");
		String 소속 = sc.next();
		for (int i = 0; i < 3; i++) {
			System.out.print("성적입력: ");
			int point = sc.nextInt();
			sum = point + sum;
		}
		System.out.println(name+","+소속+","+"총점"+sum+","+"평균"+sum/3);
	}

}
