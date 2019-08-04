package 상속2;

public class Manager extends Employee {
	
	int bounus;
	
	public void test() {
		System.out.println("관리감독하다");
		
		
		
	}

	@Override
	public String toString() {
		return "Manager [bounus=" + bounus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
				+ rrn + "]";
	}

}
