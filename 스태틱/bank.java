package ����ƽ;

public class bank {
		String product;
		String custom;
		int money; // Ŭ���� �׿� �ִ� ���� �ڵ� �ʱ�ȭ�� ���ش�. ������ ������ ���� ����־� null�̳� =0 ���� �ʿ�
		static int count; // ����ƽ ����
		static int total;
		
		
		
		public bank(String product, String custom, int money) {
			count++; // ���� ���ϱ�
			total = total + money;// ����ó�� 
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
