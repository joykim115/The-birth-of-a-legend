package 연산자;

import java.util.Date;

public class 날짜부품 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();	
		System.out.println("현재시각은:"+hour);
		
		// 비교연산자의 결과는 boolean
		// true/ false
		if(hour < 16) { //true
			System.out.println("집에갈 시간이 좀 남아있군요.");
		}
		else{
			System.out.println("집에갈 시간이 거의 다됬군요");
		}
	}

}
