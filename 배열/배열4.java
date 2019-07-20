package 배열;

public class 배열4 {

	public static void main(String[] args) {
		//성적관리 프로그램
		int[] jumsu = new int[5];
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 70;
		jumsu[3] = 60;
		jumsu[4] = 50;
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		int imsi;//초기화되지 않음.
		//쓰레기값이 들어있음
		//프린트할 수 없음
		int [] imsi2 = new int[3];
		System.out.println(imsi2[1]);  //단축키 컨트롤+슬러시(/) 누르면 한줄 주석/해제동일
		System.out.println(imsi2[0]);
		//배열은 자동 초기화를 해준다. 초기값은 0
		//int->0, double->0.0

	}
}
