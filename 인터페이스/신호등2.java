package 인터페이스;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class 신호등2 extends JFrame {
	public 신호등2() {
		setTitle("신호등");
		setSize(173, 209);
		getContentPane().setLayout(new FlowLayout());
		JButton red = new JButton("\uBE68\uAC15");
		red.setBackground(Color.RED);
		red.setFont(new Font("돋움", Font.PLAIN, 30));
		getContentPane().add(red);
		
		JButton yellow = new JButton("\uB178\uB791");
		yellow.setBackground(Color.YELLOW);
		yellow.setFont(new Font("돋움", Font.PLAIN, 30));
		getContentPane().add(yellow);
		
		JButton green = new JButton("\uCD08\uB85D");
		green.setBackground(Color.GREEN);
		green.setFont(new Font("돋움", Font.PLAIN, 30));
		getContentPane().add(green);
		
		모든처리기 a = new 모든처리기();
		red.addActionListener(a);
		yellow.addActionListener(a);
		green.addActionListener(a);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		신호등2 name = new 신호등2();
	}
}
