package 연산자;

import java.util.Date;

public class 집에갈시간 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println("현재시각은:"+hour+"시"+min+"분"+sec+"초");
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int day = date.getDay();//요일 0일요일~6토요일
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

}
