package 연산자;

import java.util.Date;

public class 나이계산2 {

	public static void main(String[] args) {
		int year = 2000;
		
		Date date = new Date();
		int thisYear = date.getYear() + 1900;
		// 밀레니엄 버그 때문에 1900을 더해줘야됨 (자동으로 1900년도 빼고 있음)
		
		int age = thisYear - year + 1;
		System.out.println("나의나이는:"+age);

	}

}
