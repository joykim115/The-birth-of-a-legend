package ���2;

public class Goodbank extends Bank {
	
	@Override
	public void getInterestRate() {
		System.out.println("��ֹ�ũ�� �������� 3.0");
	}

	@Override
	public String toString() {
		return "Goodbank [name=" + name + ", rate=" + rate + "]";
	}
	
	

}
