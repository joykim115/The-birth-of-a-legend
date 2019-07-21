package 클래스기본;

public class 계산기 {
	public void add(int x, int y) { //(매개변수)
		//매개변수(파라메터):x,y
		//메소드 정의(만듦)
		//void는 반환값이 없다.		
		System.out.println("더하기: "+(x+y));
	}
	public void minus(int x, int y) {
		System.out.println("빼기: "+(x-y));
	}
	public void mul(int x, int y) {
		System.out.println("곱하기: "+(x*y));
	}
	public void div(int x, int y) {
		System.out.println("나누기: "+(x/y));
	}

}
