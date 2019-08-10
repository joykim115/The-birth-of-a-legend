package 증감연산자;

public class 증감연산자2 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 10;
		
		sum = n++; //n은 앞에(=) 있는걸 먼저 계산하고, 뒤에 값(++)을 계산한다.
		System.out.println(sum);
		System.out.println(n);
		sum = ++n;
		System.out.println(sum);
		System.out.println(n);
		
	}
}
