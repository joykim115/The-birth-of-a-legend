package 연산자;

import java.util.Date;

public class 로그인처리 {

	public static void main(String[] args) {
		int id = 1000; // 회원가입
		int pw = 1111;
		int input = 1000; //입력한  id
		int input2 = 1111; //입력한 PW
		if (id == input && pw == input2) { // && 둘다 맞아야할때 사용 (and percent라고 부름)
			System.out.println("로그인 YES");
		}
		else {
			System.out.println("로그인 NO");
	}

}
}
	
