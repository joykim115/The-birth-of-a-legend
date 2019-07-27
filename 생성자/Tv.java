package 생성자;

public class Tv {
	//정적특징 => 멤버변수
	int ch;
	int volume;
	boolean onoff;
	
	//생성자
	//객체생성시 자동으로 호출
	public Tv(){
		System.out.println("객체 생성시 내가 자동 호출 되어요");
	}
	
	public Tv(int c, int v, boolean o) {
		ch = c;
		volume = v;
		onoff = o;
	}
	
	
	//동적특징=>멤버메소드
	public void powerOn() {
		System.out.println("TV를 켜다.");
	}
	public String powerOff() {
		return "알았어 꺼줄께";
		
	}
	
	@Override  //재정의
	public String toString() {
		// TODO Auto-generated method stub
		return ch + ","+volume+","+onoff;
	}

}
