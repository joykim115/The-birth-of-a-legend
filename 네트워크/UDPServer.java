package ��Ʈ��ũ;

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
			System.out.println("Ŭ���̾�Ʈ���� ���� ���� �Ϸ�.!");
			
		} catch (Exception e) {
		}
		
	}
}
