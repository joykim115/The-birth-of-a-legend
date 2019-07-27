package 생성자;

public class 계산기 {
	//오버로딩(다형성)
	//하나의 이름으로 다양한 형태를 구현한다.
	public void add() {
		
	}
	public void add(int x, int y) {
		System.out.println("두수의합"+(x+y));
		
	}
	public void add(String x, String y) {
		System.out.println("두단어결합"+(x+y));
	}

}
