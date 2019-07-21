package 클래스기본;

public class 계산기2사용 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		//5명, 5000원=25000원
		//2000원 이상이면 할인.
		int total=cal.mul(5, 5000);
		if (total>=20000) {
			System.out.println("당신의지불금액은"+(total-2000));
		}
		else {
			System.out.println("당신의 지불금액은"+total);
		}
	}

}
