package 순차문;

import java.util.Scanner;

public class 회원가입정보 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		// Scanner 키보드에서 읽어온 값을 컴퓨터가 인식시켜 주는 기능
		System.out.print("이름 입력:");
		String name = sc.next();// next() 프로그램 실행하자마자 콘솔에서 입력 받으라는 뜯임
		System.out.print("ID입력:");
		String id = sc.next();// next() 프로그램 실행하자마자 콘솔에서 입력 받으라는 뜯임
		System.out.print("비밀번호 입력:");
		String pw = sc.next();// next() 프로그램 실행하자마자 콘솔에서 입력 받으라는 뜯임
		System.out.print("번호 입력:");
		String num = sc.next();// next() 프로그램 실행하자마자 콘솔에서 입력 받으라는 뜯임	
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("회원가입 정보");
		System.out.println("------------");
		System.out.println("이름:"+name);
		System.out.println("아이디:"+id);
		System.out.println("비번:"+pw);
		System.out.println("연락처:"+num);
		System.out.println("------------");
		System.out.println(name+","+id+","+pw+","+num);
		}
}
