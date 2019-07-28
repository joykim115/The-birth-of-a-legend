package 스태틱;

public class companyuser {
	int a;  // class 안에는 자동 초기화
	
	public static void main(String[] args) {
		company a1 = new company("홍길동", 25, '남');
		company a2 = new company("김길동", 23, '여');
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("평균나이"+company.average+"입니다.");
		System.out.println("직원수"+company.count+"입니다.");
		
		int b = 0;  // 메소드(void) 안에는 초기화 안됨
		System.out.println(b);
		
	}
}
