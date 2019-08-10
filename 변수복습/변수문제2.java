package 변수복습;

public class 변수문제2 {

	public static void main(String[] args) {
		byte b = 100; //1바이트(127)
		int i = b; //4바이트(큰)<--1바이트(작)
		//큰<---작: 자동형변환
		
		int i2 = 100; //4바이트
		byte b2 = (byte)i2; //문제가 생겨 값을 강제로 줄여야함(최대 127까지)
		//작<---큰: 강제형변환
		System.out.println(b2);
		
		//형변환(캐스팅, casting)
//		1) 큰<----작: 자동형변환
		byte b3 = 100; //1바이트
		long l1 = b3; //8바이트
		
//		2) 작<----큰: 강제형변환
		long l2 = 100L; 
		int i3 = (int)l2;
		System.out.println(i3);
	}

}
