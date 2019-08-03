package 예외처리;

public class 계산기 {
	
	//내가처리
	public void zero() {
		try {
			System.out.println(4/0);	
		} catch (Exception e) {
			System.out.println("에러처리");	
			// TODO: handle exception
		}
	}
	
	//처리를 array를 부른 곳으로 떠넘김
	public void array() throws Exception{
		int[] num = {1,2};
		num[2] = 3;
	}

}
