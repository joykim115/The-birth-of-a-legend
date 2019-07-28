package 파일저장;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 파일저장3 {

	public static void main(String[] args) throws Exception {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("딸이름:");
		String name = sc.next();
		FileWriter file = new FileWriter(name+".txt");
		file.write(name+"\n");			
		System.out.print("나이:");
		String age = sc.next();
		file.write(age+"\n");			
		System.out.print("딸학교:");
		String school = sc.next();
		file.write(school+"\n");
		//스트림 제거
		file.close();

				
	}
}
