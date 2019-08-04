package 상속2;

public class NormalBank extends Bank {

	@Override
	public void getInterestRate() {
		System.out.println("노멀뱅크의 이자율을 5.0");
	}
	

	@Override
	public String toString() {
		return "NormalBank [name=" + name + ", rate=" + rate + "]";
	}

}
