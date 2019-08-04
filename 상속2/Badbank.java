package 상속2;

public class Badbank extends Bank {

	@Override
	public void getInterestRate() {
		System.out.println("배드뱅크의 이자율을 10.0");
	}
	
	@Override
	public String toString() {
		return "Badbank [name=" + name + ", rate=" + rate + "]";
	}
}
