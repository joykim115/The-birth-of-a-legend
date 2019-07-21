package 클래스기본;

import java.util.Date;

public class DateUser {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours(); //컨트롤 클릭하면 세부 내용 확인 가능
		System.out.println(hour);
	}

}
