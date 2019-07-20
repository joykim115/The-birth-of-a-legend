package 반복문;

import java.util.Random;
import java.util.Scanner;

public class WhileTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int data2 = r.nextInt(10);//10보다 작은 값으로 범위 설정
		int target = data2;
		int count = 0;
		while(true) {
		count++;
		System.out.print("생각한 숫자입력:");
		int data = sc.nextInt();
		if(data == target) {
		System.out.println("축하합니다. 정답입니다.");	
		System.out.println("당신의 시도 횟수는"+count+"회");
		System.out.println("당신의 실패 횟수는"+(count-1)+"회");
		break;
		}
		else {
			if(data > target) {
				System.out.println("너무큽니다.");
			}
			else {
			System.out.println("너무작습니다");
			}
			}
			System.out.println("정답이 아닙니다. 다시입력");
		}
	}
}
