package ��������;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ��������3 {

	public static void main(String[] args) throws Exception {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸�:");
		String name = sc.next();
		FileWriter file = new FileWriter(name+".txt");
		file.write(name+"\n");			
		System.out.print("����:");
		String age = sc.next();
		file.write(age+"\n");			
		System.out.print("���б�:");
		String school = sc.next();
		file.write(school+"\n");
		//��Ʈ�� ����
		file.close();

				
	}
}
