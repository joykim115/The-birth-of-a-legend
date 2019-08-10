package 변수복습;

public class 변수문제3 {

	public static void main(String[] args) {
		int num = 10;
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			//에러가 발생한 순간에 처리
			System.out.println("에러발생했는대 처리함");
		}finally {//에러의 발생 유무와 상관없이 무조건 실행하고자 하는 경우
			System.out.println("무조건 나는실행");
			//주요 사용처
			//메모리 관리를 위해 파일과의 연결을 무조건 Close!
			//네트워크 연결을 끊어야 하는경우!
		}
	}

}
