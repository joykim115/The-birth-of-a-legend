package 클래스기본;

public class Phone {

//		객체 만들기 예제
//		휴대폰 => 부류(Class)
//		- 정적특징: 모양, 사이즈 => 변수 사용
		String shape;
		int size;
//		- 동적특징: 전화받기, 카톡하다 => 메소드(함수와 동일)
		public void call() {
			System.out.println("전화하다");
		}
		
		public void katalk() {
			System.out.println("카톡하다");
		}
	}

