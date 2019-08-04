package 상속2;

public class Goodbank extends Bank {
	
	@Override
	public void getInterestRate() {
		System.out.println("노멀뱅크의 이자율을 3.0");
	}

	@Override
	public String toString() {
		return "Goodbank [name=" + name + ", rate=" + rate + "]";
	}
	
	

}
