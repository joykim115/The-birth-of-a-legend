package 스레드;

public class 자동차경주게임 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("※");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("★");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("＠");			
		}
		// 순차적으로 실행되면 게임이 될 수 없음 
	}

}
