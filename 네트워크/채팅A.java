package 네트워크;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 채팅A extends JFrame{
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	InetAddress ip;
	
	public 채팅A() throws Exception {
		socket = new DatagramSocket(5000); // 받는쪽
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채팅 A화면");
		list = new JTextArea(10, 10);
		list.setEditable(false);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = input.getText();
				System.out.println("내가 입력"+str);
				list.append("J:"+str + "\n"); // 채팅 화면에 TEXT를 입력시켜주는 함수
				input.setText("");
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data = str.getBytes();
					ip = InetAddress.getByName("127.0.0.1");// 보내는 서버IP 만들기
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);//보내는쪽
					socket.send(packet);
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		getContentPane().add(BorderLayout.CENTER, list);
		getContentPane().add(BorderLayout.SOUTH, input);
		input.setFont(new Font("굴림", Font.BOLD, 30));
		input.setBackground(Color.yellow);
		input.setForeground(Color.blue);
		list.setFont(new Font("굴림", Font.BOLD, 30));
		list.setBackground(Color.green);
		pack();
		setVisible(true);
	}
	public void process() {
		while (true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			try {
				socket.receive(packet);
				list.append("너:"+new String(data)+"\n");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) throws Exception {
		채팅A name = new 채팅A();
		//받는 부분이 먼저 실행되어 돌아가고 있어야 한다.
		name.process();
	}
}
