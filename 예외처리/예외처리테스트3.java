package 예외처리;

public class 예외처리테스트3 {
	//javac(번역기 프로그램)
	//java(실행 프로그램)
	public static void main(String[] args) {
		int a = 0;
		int b = 4;
		try {
			int c = b/a;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
			System.out.println("오류가 발생했군요");
			}
	}
}
