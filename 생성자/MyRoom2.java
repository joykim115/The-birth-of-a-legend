package ������;

public class MyRoom2 {

	public static void main(String[] args) {
		
		//�ɹ��������� ��ü������ �ڵ����� 
		//�ְ� ������ ������ �޼ҵ�
		//Ŭ���� �̸��� �����ϰ� ������ָ�
		//�ڵ�ȣ��
		Tv tv1 = new Tv(100, 10, true);
		Tv tv2 = new Tv(200, 5, false);
	
		
		// �ϳ��� ���
		System.out.println(tv1.ch);
		System.out.println(tv1.volume);
		System.out.println(tv1.onoff);
		System.out.println(tv2.ch);
		System.out.println(tv2.volume);
		System.out.println(tv2.onoff);
		
		// �ѹ��� ���		
		// ����������� ����Ʈ�ϰ� ������,
		// toString()��ҵ带 �������ϸ� �ȴ�.
		System.out.println(tv1);
		
		tv1.powerOff();
		tv2.powerOn();

	}

}
