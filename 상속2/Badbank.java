package ���2;

public class Badbank extends Bank {

	@Override
	public void getInterestRate() {
		System.out.println("����ũ�� �������� 10.0");
	}
	
	@Override
	public String toString() {
		return "Badbank [name=" + name + ", rate=" + rate + "]";
	}
}
