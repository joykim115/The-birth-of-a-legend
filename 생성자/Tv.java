package ������;

public class Tv {
	//����Ư¡ => �������
	int ch;
	int volume;
	boolean onoff;
	
	//������
	//��ü������ �ڵ����� ȣ��
	public Tv(){
		System.out.println("��ü ������ ���� �ڵ� ȣ�� �Ǿ��");
	}
	
	public Tv(int c, int v, boolean o) {
		ch = c;
		volume = v;
		onoff = o;
	}
	
	
	//����Ư¡=>����޼ҵ�
	public void powerOn() {
		System.out.println("TV�� �Ѵ�.");
	}
	public String powerOff() {
		return "�˾Ҿ� ���ٲ�";
		
	}
	
	@Override  //������
	public String toString() {
		// TODO Auto-generated method stub
		return ch + ","+volume+","+onoff;
	}

}
