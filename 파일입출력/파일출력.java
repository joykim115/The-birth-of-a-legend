package ���������;

import java.io.FileWriter;
import java.io.IOException;

public class ������� {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test.txt");
		file.write("�ڹ�"+"\n"); // \n=����
		file.write("������"+"\n");
		file.close();//��.
		//file�� java���� ������θ� stream(��Ʈ��)�̶�� �θ�
		//stream�� ���ؼ� ������ file�� ��
		//stream�� ������ ������ �ۼ��� ��
	}

}
