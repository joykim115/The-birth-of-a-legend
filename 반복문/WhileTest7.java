package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class WhileTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int data2 = r.nextInt(10);//10���� ���� ������ ���� ����
		int target = data2;
		int count = 0;
		while(true) {
		count++;
		System.out.print("������ �����Է�:");
		int data = sc.nextInt();
		if(data == target) {
		System.out.println("�����մϴ�. �����Դϴ�.");	
		System.out.println("����� �õ� Ƚ����"+count+"ȸ");
		System.out.println("����� ���� Ƚ����"+(count-1)+"ȸ");
		break;
		}
		else {
			if(data > target) {
				System.out.println("�ʹ�Ů�ϴ�.");
			}
			else {
			System.out.println("�ʹ��۽��ϴ�");
			}
			}
			System.out.println("������ �ƴմϴ�. �ٽ��Է�");
		}
	}
}
