package 생성자;

public class MyRoom {

	public static void main(String[] args) {
		//new => 객체생성 tv1, tv2
		//객체생성시 멤버변수가 복사가 된다.
		//각 멤버변수에 값을 집어넣어야 한다.
		//생성자-객체생성과 동시에 멤버변수값을 한번에 집어 넣어주는 특별한 메소드
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		//주소값 출력
		System.out.println(tv1);
		System.out.println(tv2);
		
		tv1.ch=100;
		tv1.volume=10;
		tv1.onoff=true;
		
		tv2.ch=200;
		tv2.volume = 5;
		tv2.onoff =false;
		
		tv1.powerOff();
		tv2.powerOn();

	}

}
