package ����ƽ;

public class Car {
	int speed; // ������� ���� �� ���ε��� ���翹��
	static	int count; //���� Ŭ������ 1��
	
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

