package �迭;

import java.util.Scanner;

public class �迭7 {
	public static void main(String[] args) {
		int[] seat = new int[10];
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+"");	
		}
		System.out.println("");
		System.out.println("---------------------");
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + "");
		}
		System.out.println();
		seat[4] = 1; //�����ؾ��ϴ� �¼� �����ϱ�
		seat[5] = 1;
		
		for (int i = 0; i < seat.length; i++) {
			//��� �ڸ� ��Ȳ ����Ʈ
			//5,6�� �ڸ� ����ó��
			//0->1�� ����
			System.out.print(seat[i]+"");
			
		}
	}
}
