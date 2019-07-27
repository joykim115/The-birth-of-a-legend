package »ý¼ºÀÚ;

public class Computer {
	
	int price;
	String company;
	
	public Computer(int p, String n) {
		price = p;
		company = n;
	
	}
	
	@Override
	public String toString() {
		return price + "," + company;
	}

}
