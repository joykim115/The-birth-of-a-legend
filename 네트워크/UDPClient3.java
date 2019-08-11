package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient3 {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(7000);
			System.out.println("서버로 부터 전송 수신 준비 끝3.....");
			byte[] data = new byte[256];
			
			DatagramPacket packet 
			 = new DatagramPacket(data, data.length);
			
			socket.receive(packet);
			String data2 = new String(data);
			System.out.println("서버로 받은 데이터는 " + data2);
			System.out.println("서버로 부터 데이터 수신 완료.!! ");
		} catch (Exception e) {
		}
	}

}
