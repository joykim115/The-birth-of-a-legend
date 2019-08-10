package 변수복습;

public class 계좌 {
	
	//전역변수(글로벌 변수, Global variable)
	//자동 초기화
	String accountName; // 계좌명
	String name;//사람이름
	int money;//초기입금액
	
	//객체 생성시 자동 호출 메소드
	//생성자
	public 계좌(String accountName, String name, int money) {
		super();
		this.accountName = accountName;
		this.name = name;
		this.money = money;
		System.out.println(this.money);
		//전역변수
	}

	@Override
	public String toString() {
		return "계좌 [accountName=" + accountName + ", name=" + name + ", money=" + money + "]";
	}
	

}
