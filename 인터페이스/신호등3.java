package �������̽�;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ��ȣ��3 extends JFrame implements ActionListener {
	JButton red, green, yellow;// ��������, Ŭ���� ������ ��� ���� ����

	public ��ȣ��3() {
		setTitle("��ȣ��");
		setSize(355, 400);
		getContentPane().setLayout(new FlowLayout());
		red = new JButton("\uBE68\uAC15");
		red.setBackground(Color.RED);
		red.setFont(new Font("����", Font.PLAIN, 30));
		getContentPane().add(red);

		yellow = new JButton("\uB178\uB791");
		yellow.setBackground(Color.YELLOW);
		yellow.setFont(new Font("����", Font.PLAIN, 30));
		getContentPane().add(yellow);

		green = new JButton("\uCD08\uB85D");
		green.setBackground(Color.GREEN);
		green.setFont(new Font("����", Font.PLAIN, 30));
		getContentPane().add(green);
		red.addActionListener(this);
		yellow.addActionListener(this);
		green.addActionListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		��ȣ��3 name = new ��ȣ��3();
	}

	public void actionPerformed(ActionEvent e) {
		JLabel add = new JLabel();
		if (e.getSource() == red) {
			ImageIcon icon = new ImageIcon("1.png");
			add.setIcon(icon);
		} else if (e.getSource() == yellow) {
			ImageIcon icon = new ImageIcon("2.png");
			add.setIcon(icon);
		} else {
			ImageIcon icon = new ImageIcon("4.jpg");
			add.setIcon(icon);
		}

		add(add);
		setVisible(true);
	}
}
