package 상속2;

public class Employee {
	String name;  // 이름
	String address;  // 주소
	int salary; // 월급
	int rrn; // 주민번호
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
