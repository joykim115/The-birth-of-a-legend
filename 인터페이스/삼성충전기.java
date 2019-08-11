package 인터페이스;

public class 삼성충전기 implements 충전기 {

	@Override
	public void 네모로만들어야함() {
		System.out.println("입체네모로 만들다");
	}

	@Override
	public void 분리되어야함() {
		System.out.println("이중으로 분리되게 만들다");
		
	}

}
