package ��������;

import java.io.FileWriter;
import java.io.IOException;

public class �������� {
	public static void main(String[] args) throws Exception {
		//�ܺ� �ڿ��� �����Ҷ�
		//������ �ٷ궧 : ����, ��Ʈ��ũ, db
		//������ ����ó�� �ؾ���
		FileWriter file = new FileWriter("test.txt");
		file.write("hello java"+"\n");// + "\n" ����
		file.write("byebye"+"\n");
		file.close();
	}
}
