package 조건문;

import java.util.Date;

public class 조건문2 {  // else if 배우기 if - else if - else로 종료
	public static void main(String[] args) {
		
		//컨트롤+쉬프트+영문 o 누르면 임포트 선택 창을 띠울 수 있음, 자동 임포트
		Date date = new Date();
		int hour = date.getHours();//현재시각
		
		if (hour <= 11) {
			System.out.println("굿모닝");
		}
		else if(hour <= 15) {
			System.out.println("굿에프터눈");
		}
		else if (hour <= 20) {
			System.out.println("굿이브닝");
		}
		else {
			System.out.println("굿나잇");
		}
	}
}

