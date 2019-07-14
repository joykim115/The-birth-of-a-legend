package Á¶°Ç¹®;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Áß±¹Áý¸Þ´º÷÷ {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(500,500);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("±Ã¼­", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uC911\uAD6D\uC9D1 \uBA54\uB274\uB97C \uC815\uD574\uC694");
		j.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JButton A1 = new JButton("\uC9DC\uC7A5");
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Â¥Àå¸éÀ» ¸Ô¾î¿ä");
			}
		});
		A1.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\\uC0C8 \uD3F4\uB354 (3)\\\uC9DC\uC7A5.jpg"));
		j.getContentPane().add(A1, BorderLayout.WEST);
		
		JButton A2 = new JButton("\uC9EC\uBF55");
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Â«ÆþÀ» ¸Ô¾î¿ä");
			}
		});
		A2.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\\uC0C8 \uD3F4\uB354 (3)\\\uC9EC\uBF55.jpg"));
		j.getContentPane().add(A2, BorderLayout.CENTER);
		
		JButton A3 = new JButton("\uC6B0\uB3D9");
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("¿ìµ¿À» ¸Ô¾î¿ä");
			}
		});
		A3.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\\uC0C8 \uD3F4\uB354 (3)\\\uC6B0\uB3D9.jpg"));
		j.getContentPane().add(A3, BorderLayout.EAST);
		j.setVisible(true);

	}

}
