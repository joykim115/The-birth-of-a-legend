package 상속2;

public class ManagerUser {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "홍길동";
		m.address = "강남구";
		m.salary = 300;
		m.rrn = 000000;
		m.bounus = 1000;
		m.test();
		
		System.out.println(m);
	}

}
