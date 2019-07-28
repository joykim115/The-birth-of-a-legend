package 파일저장;

public class 에러발생 {

	public static void main(String[] args) {
		try { //에러처리
		System.out.println(5/0);
		}catch (Exception e) { 
			System.out.println("에러처리함");
		}
		System.out.println("나는실행될까?");
	}

}
