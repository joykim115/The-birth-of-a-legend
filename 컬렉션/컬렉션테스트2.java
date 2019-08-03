package 컬렉션;

import java.util.ArrayList;

public class 컬렉션테스트2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("금스키");
		list.add("박스키");
		
		System.out.println(list);
		list.remove(1);//2등 탈락
		System.out.println(list);
		
	}

}
