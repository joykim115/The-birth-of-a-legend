package 조건문;

import java.util.Date;

public class 조건문1 {
	public static void main(String[] args) {
		
		//컨트롤+쉬프트+영문 o 누르면 임포트 선택 창을 띠울 수 있음, 자동 임포트
		Date date = new Date();
		int hour = date.getHours();//현재시각
		
		if (hour <= 12) {
			System.out.println("오전");
		}
		else {
			System.out.println("오후");
		}
	}
}

