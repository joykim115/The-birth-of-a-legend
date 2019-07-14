package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 그래픽이미지넣기 {
	private static JTextField textField;

	public static void main(String[] args) {
       JFrame f = new JFrame();
       f.setSize(500, 500);
       
       JButton b1 = new JButton("\uBC14\uC704");
       JButton a1 = new JButton("\uAC00\uC704");
       JButton o1 = new JButton("\uBCF4");
       JButton buttom = new JButton("");
       b1.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
           		System.out.println("바위를 누르셨군요.");
           		int b1 = 1;
           		Random r = new Random();
           		//0->가위, 1->바위, 2->보
           		int computer = r.nextInt(3);
           		System.out.println("사람은"+b1+"을"+" 컴퓨터는"+computer+"을 냈습니다");
           		if(computer == 1) {//
           			buttom.setText("비겼음");
           		}
           		else if(computer == 2) {
           			buttom.setText("컴퓨터승");
           			               		}
           		else {  				
    				buttom.setText("내가승");
           	}      		           		
     	}       	
       });
       b1.setBackground(Color.ORANGE);
       b1.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\\uC0C8 \uD3F4\uB354 (3)\\\uBC14\uC704.jpg"));
       f.getContentPane().add(b1, BorderLayout.CENTER);
       
       a1.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		System.out.println("가위를 누르셨군요.");
       		int a1 = 0;
       		Random r = new Random();
       		//0->가위, 1->바위, 2->보
       		int computer = r.nextInt(3);
       		System.out.println("사람은"+a1+"을"+" 컴퓨터는"+computer+"을 냈습니다");
       		if(computer == 0) {//
       			buttom.setText("비겼음");
       		}
       		else if(computer == 1) {
       			buttom.setText("컴퓨터승");
           		}
       		else {
				buttom.setText("내가승");
       		}
       		
       	}
       });
       a1.setBackground(Color.RED);
       a1.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\\uC0C8 \uD3F4\uB354 (3)\\\uAC00\uC704.jpg"));
       f.getContentPane().add(a1, BorderLayout.WEST);
       
       o1.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		System.out.println("보를 누르셨군요.");
       		int o1 = 2;
       		Random r = new Random();
       		//0->가위, 1->바위, 2->보
       		int computer = r.nextInt(3);
       		System.out.println("사람은"+o1+"을"+" 컴퓨터는"+computer+"을 냈습니다");
       		if(computer == 2) {//
       			buttom.setText("비겼음");
       		}
       		else if(computer == 0) {
       			buttom.setText("컴퓨터승");
           		}
       		else {
				buttom.setText("내가승");
       		}
       		
       	}
       });
       o1.setBackground(Color.BLUE);
       o1.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-05\\Desktop\\\uC0C8 \uD3F4\uB354 (3)\\\uBCF4.jpg"));
       f.getContentPane().add(o1, BorderLayout.EAST);
       
       textField = new JTextField();
       textField.setFont(new Font("굴림", Font.PLAIN, 20));
       textField.setForeground(new Color(0, 0, 0));
       textField.setBackground(Color.YELLOW);
       textField.setHorizontalAlignment(SwingConstants.CENTER);
       textField.setText("\uAC00\uC704 \uBC14\uC704 \uBCF4 \uAC8C\uC784\uC744 \uD574\uC694");
       f.getContentPane().add(textField, BorderLayout.NORTH);
       textField.setColumns(10);
       
       buttom.setFont(new Font("굴림", Font.PLAIN, 20));
       f.getContentPane().add(buttom, BorderLayout.SOUTH);
       f.setVisible(true);
       
	}

}
