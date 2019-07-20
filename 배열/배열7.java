package 배열;

import java.util.Scanner;

public class 배열7 {
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
		seat[4] = 1; //예매해야하는 좌석 설정하기
		seat[5] = 1;
		
		for (int i = 0; i < seat.length; i++) {
			//모든 자리 상황 프린트
			//5,6번 자리 예매처리
			//0->1로 저장
			System.out.print(seat[i]+"");
			
		}
	}
}
