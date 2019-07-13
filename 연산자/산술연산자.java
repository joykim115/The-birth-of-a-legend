package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int n1 = 200;
		int n2 = 100;
		//비교연산자의 종류는 boolean이다 
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 > n2);
		//컨트롤+알트+화살표 아래: 복사
		//알트+화살표: 이동
		
		//산술연산자 종류
		System.out.println("합:"+(n1 + n2));
		System.out.println("차:"+(n1 - n2));
		System.out.println("곱:"+(n1 * n2));
		System.out.println("나누기:"+(n1 / n2));
		System.out.println("소수점:"+(n1 % n2));

	}

}
