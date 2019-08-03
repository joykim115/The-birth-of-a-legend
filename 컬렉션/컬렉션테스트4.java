package 컬렉션;

import java.util.LinkedList;

public class 컬렉션테스트4 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		System.out.println(milk);
		milk.remove(); // 삭제 요청
		System.out.println(milk); // 앞에꺼 부터 삭제
		
	}

}
