package ������;

import java.util.Scanner;

public class ȸ���������� {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		// Scanner Ű���忡�� �о�� ���� ��ǻ�Ͱ� �νĽ��� �ִ� ���
		System.out.print("�̸� �Է�:");
		String name = sc.next();// next() ���α׷� �������ڸ��� �ֿܼ��� �Է� ������� ����
		System.out.print("ID�Է�:");
		String id = sc.next();// next() ���α׷� �������ڸ��� �ֿܼ��� �Է� ������� ����
		System.out.print("��й�ȣ �Է�:");
		String pw = sc.next();// next() ���α׷� �������ڸ��� �ֿܼ��� �Է� ������� ����
		System.out.print("��ȣ �Է�:");
		String num = sc.next();// next() ���α׷� �������ڸ��� �ֿܼ��� �Է� ������� ����	
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("ȸ������ ����");
		System.out.println("------------");
		System.out.println("�̸�:"+name);
		System.out.println("���̵�:"+id);
		System.out.println("���:"+pw);
		System.out.println("����ó:"+num);
		System.out.println("------------");
		System.out.println(name+","+id+","+pw+","+num);
		}
}
