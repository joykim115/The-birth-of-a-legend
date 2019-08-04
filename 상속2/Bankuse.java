package »ó¼Ó2;

public class Bankuse {

	public static void main(String[] args) {
		Badbank b = new Badbank();
		NormalBank n = new NormalBank();
		Goodbank g = new Goodbank();
		
		b.name = "Badbank";
		n.name = "NormalBank";
		g.name = "Goodbank";
		
		b.rate = 10.0;
		n.rate = 5.0;
		g.rate = 3.0;
		
		
		b.getInterestRate();
		n.getInterestRate();
		g.getInterestRate();
		
		
		System.out.println(b);
		System.out.println(n);
		System.out.println(g);
		
		
	}

}
