package 조건문;

import java.util.Scanner;

public class 두수비교 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1을 입력해주세요");
		int num1 = sc.nextInt();
		System.out.print("숫자2을 입력해주세요");
		int num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("두수가 같습니다");
			}
		else {
				System.out.println("두수가다릅니다.");
			}
		}
			
	}
