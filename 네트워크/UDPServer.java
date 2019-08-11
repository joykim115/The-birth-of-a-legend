package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			String data = "Java Programmer...!!";
			byte[] data2 = data.getBytes();
			
			InetAddress ip 
			  = InetAddress.getByName("127.0.0.1");
			
			DatagramPacket packet 
			   = new DatagramPacket(data2, data2.length, ip, 5000);
			
			socket.send(packet);
			System.out.println("클라이언트에게 정보 전송 완료.!");
			
		} catch (Exception e) {
		}
		
	}
}
