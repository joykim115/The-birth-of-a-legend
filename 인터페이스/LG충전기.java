package 인터페이스;

public class LG충전기 implements 충전기 {

	@Override
	public void 네모로만들어야함() {
		System.out.println("핑크로 네모로 만들다");
	}

	@Override
	public void 분리되어야함() {
		System.out.println("한번에 분리되게 만들다");
		
	}

}
