package ���2;

public class NormalBank extends Bank {

	@Override
	public void getInterestRate() {
		System.out.println("��ֹ�ũ�� �������� 5.0");
	}
	

	@Override
	public String toString() {
		return "NormalBank [name=" + name + ", rate=" + rate + "]";
	}

}
