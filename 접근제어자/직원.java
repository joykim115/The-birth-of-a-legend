package 접근제어자;

public class 직원 {
	public String name;// 모두다 +
	String address; // 같은 패키지내 
	protected int salary; //같은패키지 혹은 상속된 다른 패키지#
	private int rrn;// 주민번호, 클래스 밖에서는 접근 불가-

}
