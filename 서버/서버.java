package ����;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ���� {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("������ ���۵�");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�");// ���� ����
		int count = 0;//���������� �ʱ�ȭ
		Socket socket = null;
		
		while(true) {//���� ���Ḧ �������� ���α׷��� ��� ����
			socket = server.accept();//����!
			System.out.println("Ŭ���̾�Ʈ���� ���� ����:"+count);
			count++;
		}
//		socket.close();
//		server.close();	
	}
}
