package 컬렉션;

import java.util.HashMap;

public class 컬렉션테스트6 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "메론");
		map.put("book","책");
		System.out.println(map);
		System.out.println(map.get("apple"));
		
	}

}
