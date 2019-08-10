package 변수복습;

public class 변수문제 {
	//변수의 생존 범위는 선언의 위치에 따라 결정, 변수의 생성된 위치
	int num2;//전역변수(전체에서 쓸 수 있음)
	public static void main(String[] args) {
		// 데이터 저장 공간을 만들고,
		int num;// 데이터타입 변수명; main 안에서 쓸 수 있는 지역변수		
		//i는 for 안에서 만들어졌기 때문에 지역변수
		for (int i = 0; i < 3; i++) {
			num = 10;
		}
		// 데이터타입 변수명;
		// 변수 생성! 선언!
		// 선언을 하면 변수 생성
		// 데이터에 집어 넣는다.
	}
}
