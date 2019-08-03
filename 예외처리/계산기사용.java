package 예외처리;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.zero();
		try {
			cal.array();// 에러가 던저짐
		} catch (Exception e) {
			System.out.println("에러처리 완료2");
		}

	}
}
