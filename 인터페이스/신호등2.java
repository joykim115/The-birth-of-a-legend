package �������̽�;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class ��ȣ��2 extends JFrame {
	public ��ȣ��2() {
		setTitle("��ȣ��");
		setSize(173, 209);
		getContentPane().setLayout(new FlowLayout());
		JButton red = new JButton("\uBE68\uAC15");
		red.setBackground(Color.RED);
		red.setFont(new Font("����", Font.PLAIN, 30));
		getContentPane().add(red);
		
		JButton yellow = new JButton("\uB178\uB791");
		yellow.setBackground(Color.YELLOW);
		yellow.setFont(new Font("����", Font.PLAIN, 30));
		getContentPane().add(yellow);
		
		JButton green = new JButton("\uCD08\uB85D");
		green.setBackground(Color.GREEN);
		green.setFont(new Font("����", Font.PLAIN, 30));
		getContentPane().add(green);
		
		���ó���� a = new ���ó����();
		red.addActionListener(a);
		yellow.addActionListener(a);
		green.addActionListener(a);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		��ȣ��2 name = new ��ȣ��2();
	}
}
