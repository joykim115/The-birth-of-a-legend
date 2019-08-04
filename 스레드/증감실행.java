package 스레드;

public class 증감실행 {

	public static void main(String[] args) {
		증가 up = new 증가();
		감소 down = new 감소();
		
		up.start();
		down.start();
		
	}

}
