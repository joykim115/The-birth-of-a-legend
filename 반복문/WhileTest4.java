package �ݺ���;

public class WhileTest4 {
	//�� 10�� ��� ����
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 1000) {
			sum = sum + i;// sum�� ���� ���� �ٽ� sum�� ����
			i++;
		}
		System.out.print("������"+sum);
	}
}
