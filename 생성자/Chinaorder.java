package 생성자;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Chinaorder {
	static int check = 0;
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 중국집 메뉴판");
		JTextField num = new JTextField(5);
		JButton count = new JButton("계산");
		JButton p1 = new JButton("짜장");
		JButton p2 = new JButton("짬뽕");
		JButton p3 = new JButton("우동");
		JLabel result = new JLabel("");
		f.setSize(200, 500);
		FlowLayout	flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		
		JButton img = new JButton();
		ImageIcon icon1 = new ImageIcon("006.jpg");
		img.setIcon(icon1);
		f.getContentPane().add(img);
		
		
				
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon1 = new ImageIcon("006.jpg");//짜장
				img.setIcon(icon1);		
				check = 1;
			}
		});
		f.getContentPane().add(p1);
		
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon1 = new ImageIcon("007.jpg");//짬뽕
				img.setIcon(icon1);
				check =2;
			}
		});
		f.getContentPane().add(p2);
		
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon1 = new ImageIcon("008.jpg");//우동
				img.setIcon(icon1);
				check = 3;
			}
		});
		f.getContentPane().add(p3);
		f.getContentPane().add(num);
		f.add(count);	
		f.add(result);
		count.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				String s1 = num.getText();
				int i1 = Integer.parseInt(s1);//1
				if (check == 1) {
					System.out.println("1");
					result.setText((i1*3000)+"");
				}
				else if(check == 2){
					System.out.println("2");
					System.out.println("1");
					result.setText((i1*3000)+"");
				}
				else if(check == 3){
					System.out.println("3");
					System.out.println("1");
					result.setText((i1*9000)+"");
				}	
			}
		});		
		f.setVisible(true);
	}
}

