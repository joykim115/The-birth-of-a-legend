package 배열심화;

public class ForEachTest {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println("첫번빼 num:"+num[0]);
		System.out.println("배열의 개수:"+num.length);
		System.out.println("마지막 num:"+num[num.length-1]);
		
		for (int i = 0; i < num.length; i++) {//i는 배열의 위치값
			System.out.println(num[i]);
		}
		for (int x : num) { //끝까지 값을 불러오는 함수
			// int 위에 위치 값과 상관없는 변수 속성만 정의 
			System.out.println(x);
		}
		
		String[] names = {"홍길동","박길동","김길동"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String a : names) {
			System.out.println(a);
		}
	}

}
