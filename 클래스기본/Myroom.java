package Ŭ�����⺻;

public class Myroom {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.shape = "�׸�";
		p1.size =9 ;
		
		p1.call();
		p1.katalk();
		
		Phone p2 = new Phone();
		p2.shape="���簢��";
		p2.size = 11;
		p2.katalk();
		
	
		Dog d1 = new Dog();
		d1.dog = "����";
		d1.weight = 50;
		d1.bite();
		
		Dog d2 = new Dog();
		d2.dog = "����";
		d2.weight = 20;
		d1.bite();
		d2.sound();
		
	}

}
