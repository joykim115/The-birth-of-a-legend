package 서버;

import java.net.Socket;

public class 클라이언트2 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9100);
		System.out.println("서버접속성공");		
	}
}
