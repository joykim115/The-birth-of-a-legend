package 상속2;

public class 자동차사용 {

	public static void main(String[] args) {
		
		세단 s = new 세단();
		
		s.color = "빨강";
		s.name = "세련세단";
		s.start();//자동차 꺼였고
		s.windowOpen();// 세단꺼
		
		System.out.println(s);
		
		트럭 t = new 트럭();
		
		t.color = "회색";
		t.name = "포토";
		t.start();//
		t.move();//
		System.out.println(t);
	}

}
