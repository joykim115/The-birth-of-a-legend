package 서버;

import java.net.Socket;

public class 클라이언트 {
	public static void main(String[] args) {
		Socket socket=null;//참조형
		try {
		socket = new Socket("localhost", 9100);
		System.out.println("서버접속성공");
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
