package ����;

import java.net.Socket;

public class Ŭ���̾�Ʈ {
	public static void main(String[] args) {
		Socket socket=null;//������
		try {
		socket = new Socket("localhost", 9100);
		System.out.println("�������Ӽ���");
		}catch(Exception e)
		{
		}finally {
			try {
				socket.close();
			}catch(Exception e) {
			}
		}
	}
}
