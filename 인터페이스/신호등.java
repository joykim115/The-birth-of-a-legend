package �������̽�;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class ��ȣ�� extends JFrame {
	public ��ȣ��() {
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
		
		Redó���� r = new Redó����();
		red.addActionListener(r);
		Yellowó���� y = new Yellowó����();
		yellow.addActionListener(y);
		greenó���� g = new greenó����();
		green.addActionListener(g);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		��ȣ�� name = new ��ȣ��();
	}
}
