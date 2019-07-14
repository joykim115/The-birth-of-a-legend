package 조건문;

import java.util.Random;

public class 로또번호발생기 {
	public static void main(String[] args) {
		Random r = new Random(); // 랜덤하게 숫자가 발생되게 하는 함수
		System.out.println(r.nextInt(45));
		System.out.println(r.nextInt(45));
		System.out.println(r.nextInt(45));
		System.out.println(r.nextInt(45));
		System.out.println(r.nextInt(45));
		System.out.println(r.nextInt(45));
	}
}
