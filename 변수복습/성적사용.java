package 변수복습;

import java.util.Scanner;

public class 성적사용 {
	

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int sum=0;
	
		for (int i = 0; i < 5; i++) {
			System.out.print("이름입력: ");
			String name = sc.next();
			System.out.print("성적입력: ");
			int point = sc.nextInt();
			성적입력 a = new 성적입력(name, point);
			sum = point + sum;
			System.out.println(a);
		}
		System.out.println(sum);
	}

}
