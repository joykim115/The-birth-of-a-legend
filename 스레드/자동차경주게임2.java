package 스레드;

public class 자동차경주게임2 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car2 c2 = new Car2();
		Car3 c3 = new Car3();
		
		c1.start(); // start(); 실행시키는 메소드
		c2.start();
		c3.start();
	}

}
