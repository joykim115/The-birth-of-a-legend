package 서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class 서버 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버가 시작됨");
		System.out.println("클라이언트의 접속을 기다림");// 서버 종료
		int count = 0;//지역변수라 초기화
		Socket socket = null;
		
		while(true) {//서버 종료를 막기위해 프로그램을 계속 돌림
			socket = server.accept();//승인!
			System.out.println("클라이언트와의 연결 성공:"+count);
			count++;
		}
//		socket.close();
//		server.close();	
	}
}
