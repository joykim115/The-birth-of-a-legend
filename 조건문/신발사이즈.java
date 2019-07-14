package 조건문;

import java.util.Scanner;

public class 신발사이즈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("오늘 기온은?");
		int temp = sc.nextInt();
		System.out.print("오늘 나의 평가는?");
		String point = sc.next();
		System.out.print("나의신발사이즈는?");
		double size = sc.nextDouble();	
		System.out.println("오늘은 "+temp+"도, "+"나의평가는 "+point+", "+"신발은 " +size);
	}

}
