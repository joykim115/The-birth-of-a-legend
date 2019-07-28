package 스태틱;

public class Caruser {

	public static void main(String[] args) {
		Car car1 = new Car(100);
		Car car2 = new Car(200);
		
		car1.speedUP(); // 일반 메소드는 생성된 객체이름.메소드 이름으로 접근
		System.out.println(Car.count);
		Car.printCount();
	}

}
