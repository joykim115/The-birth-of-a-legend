package ������;

public class MyRoom {

	public static void main(String[] args) {
		//new => ��ü���� tv1, tv2
		//��ü������ ��������� ���簡 �ȴ�.
		//�� ��������� ���� ����־�� �Ѵ�.
		//������-��ü������ ���ÿ� ����������� �ѹ��� ���� �־��ִ� Ư���� �޼ҵ�
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		//�ּҰ� ���
		System.out.println(tv1);
		System.out.println(tv2);
		
		tv1.ch=100;
		tv1.volume=10;
		tv1.onoff=true;
		
		tv2.ch=200;
		tv2.volume = 5;
		tv2.onoff =false;
		
		tv1.powerOff();
		tv2.powerOn();

	}

}
