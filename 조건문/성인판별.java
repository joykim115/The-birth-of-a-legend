package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 성인판별 {
	public static void main(String[] args) {
		System.out.print("태어난 해입력>>");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); //next+Type은 형식을 봐꿔서 불러와줌
		
		Date date = new Date();
		int thisYear = date.getYear() + 1900;
		
		int age = thisYear - year + 1;
		System.out.println("당신의 나이는" + age + "살");
		if(age>=18) {
			System.out.println("성인");
		}
		else {
				System.out.println("미성인");
			}
		}
	}

