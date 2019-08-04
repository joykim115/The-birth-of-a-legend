package 상속2;

public class 트럭 extends 자동차{
	//변수2개
	//메소드2개
	
	public void move() {
		System.out.println("짐을 나르다.");		
	}

	@Override
	public String toString() {
		return "트럭 [color=" + color + ", name=" + name + "]";
	}
	
	

}
