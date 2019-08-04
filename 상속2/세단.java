package 상속2;

public class 세단 extends 자동차 {
	//변수2개
	//메소드2개
	
	public void windowOpen() {
		System.out.println("조용히 창문이 열린다.");
	}

	@Override
	public String toString() {
		return "세단 [color=" + color + ", name=" + name + "]";
	}
	
	
	
	
}
