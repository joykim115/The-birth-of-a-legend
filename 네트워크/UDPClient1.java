package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient1 {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(5000);
			System.out.println("������ ���� ���� ���� �غ� ��1.....");
			byte[] data = new byte[256];
			
			
			DatagramPacket packet 
			 = new DatagramPacket(data, data.length);
			
			socket.receive(packet);
			String data2 = new String(data);
			System.out.println("������ ���� �����ʹ� " + data2);
			System.out.println("������ ���� ������ ���� �Ϸ�.!! ");
		} catch (Exception e) {
		}
	}

}
