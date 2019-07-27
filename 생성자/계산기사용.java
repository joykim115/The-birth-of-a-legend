package 생성자;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		cal.add(10, 20);
		cal.add("만두", "좋아");

	}

}
