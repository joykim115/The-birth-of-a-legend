package 변수복습;

public class 구구단 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("구구단을 외자"+i+"단");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			} 
			System.out.println("");
		}
	}

}
