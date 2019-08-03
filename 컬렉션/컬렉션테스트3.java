package 컬렉션;

import java.util.HashSet;

public class 컬렉션테스트3 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("휴대폰");
		System.out.println(bag);
		bag.add("볼펜");//중복값 넣기
		System.out.println(bag);//중복값 자동 필터링
	}

}
