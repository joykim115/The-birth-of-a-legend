package 생성자;

public class MyRoom2 {

	public static void main(String[] args) {
		
		//맴버변수값을 객체생성시 자동으로 
		//넣고 싶으면 생성자 메소드
		//클래스 이름과 동일하게 만들어주면
		//자동호출
		Tv tv1 = new Tv(100, 10, true);
		Tv tv2 = new Tv(200, 5, false);
	
		
		// 하나씩 찍기
		System.out.println(tv1.ch);
		System.out.println(tv1.volume);
		System.out.println(tv1.onoff);
		System.out.println(tv2.ch);
		System.out.println(tv2.volume);
		System.out.println(tv2.onoff);
		
		// 한번에 찍기		
		// 멤버변수값을 프린트하고 싶으면,
		// toString()멘소드를 재정의하면 된다.
		System.out.println(tv1);
		
		tv1.powerOff();
		tv2.powerOn();

	}

}
