package 반복문;

public class 삼항연산자 {

	public static void main(String[] args) {
		int num = 3;
		System.out.println((num<5) ? "5보다 작다":"5보다 작지 않다"); 
		//if 대신 간단하게 만드는 연산: 앞에 조건 ? true:false
		char result = (num < 5)? 'A' : 'B';
		System.out.println("최종결과는"+result);
	}

}
