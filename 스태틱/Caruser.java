package ����ƽ;

public class Caruser {

	public static void main(String[] args) {
		Car car1 = new Car(100);
		Car car2 = new Car(200);
		
		car1.speedUP(); // �Ϲ� �޼ҵ�� ������ ��ü�̸�.�޼ҵ� �̸����� ����
		System.out.println(Car.count);
		Car.printCount();
	}

}
