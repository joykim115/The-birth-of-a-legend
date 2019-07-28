package 스태틱;

public class bank {
		String product;
		String custom;
		int money; // 클래스 및에 있는 것은 자동 초기화를 해준다. 원래는 쓰레기 값이 들어있어 null이나 =0 선언 필요
		static int count; // 스태틱 선언
		static int total;
		
		
		
		public bank(String product, String custom, int money) {
			count++; // 개수 더하기
			total = total + money;// 누적처리 
			this.product = product;
			this.custom = custom;
			this.money = money;
		}
		
		public static void printCount() {
			System.out.println(count);
		}


		@Override
		public String toString() {
			return product+" " + custom+" " + money+" ";
		}	

	
	
}
