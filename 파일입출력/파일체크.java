package ���������;

import java.io.File;
import java.util.Iterator;

public class ����üũ {

	public static void main(String[] args) {
		File file = new File("D:\\�л���\\day07");//������ ����� ���� �ҷ�����
		System.out.println(file.exists());//���� �����ϴ�?
		System.out.println(file.isDirectory());//������?
		System.out.println(file.isFile());//�����̴�?
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);//���� ����Ʈ ��� - �� �ڹٰ� ���Ϸ� �ν��ϴ°� �߰� ��ġ �ʿ�
		}
		System.out.println(list.length);//���� ���� Ȯ��
	}

}
