package 예외처리;

public class 예외처리테스트2 {

	public static void main(String[] args) {
		try {
			//에러가 발생할 것 같은 코드
			int[] num = {1,2}; //num에는 0,1번 자리만 존재
			//프로그래밍은 0번부터 자리가 배정 됨
			num[2] =3; //에러발생
			//num[2]는 3번 자리에 입력해달라는 소리임	
		}catch (Exception e) {	
			//에러 처리 내용 코드 
			e.printStackTrace();//에러코드 출력
			System.out.println("에러발생");
		}
		System.out.println("내가 실행될까요?");
	}
}
