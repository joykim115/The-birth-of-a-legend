package 스태틱;

public class Car {
	int speed; // 멤버변수 차당 다 따로따로 복사예정
	static	int count; //누적 클래스당 1개
	
	public static void printCount() {
		System.out.println(count);
	}
	public Car(int speed) {
		count++;
		this.speed = speed;
	}
	
	public void speedUP() {
		System.out.println("speedUP---!!!");
	}
}

