package 생성자;

import java.util.Scanner;

public class 은행시스템 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = null;//Account A가 미리 존재해야 계속 기억 가능, 메모리 확보
		while (true) {//무한루프
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료|");
			System.out.println("-----------------------------------");
			System.out.print("선택>>");
			int input = sc.nextInt();			
			if (input == 1) { // 계좌생성
				System.out.println("------"); 
				System.out.println("계좌생성"); 
				System.out.println("------");
				System.out.println("계좌번호입력:");
				String data1 = sc.next();
				System.out.println("계좌주인:");
				String data2 = sc.next();
				System.out.println("입금액:");
				int data3 = sc.nextInt();
				a = new Account(data1, data2, data3);
				System.out.println("결과: 계좌가 생성되었습니다.");				
			}
			else if (input == 2) {//계좌목록
				System.out.println(a);
				//toString 매소드 생성				
			}
			else if (input == 3) {//예금
				System.out.println("예금액:");
				int data4 = sc.nextInt();
				a.total = a.total + data4;
				System.out.println("현재금액:"+ a.total +"원");
			}			
			else if (input == 4) {//출금
				int data5 = sc.nextInt();
				a.total = a.total - data5;
				System.out.println("현재금액:"+ a.total +"원");
			}			
			else { // 5일때 종료
				System.out.println("byebye~");
				break;
			}
		}
	}

}
