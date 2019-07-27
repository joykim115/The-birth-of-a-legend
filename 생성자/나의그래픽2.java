package 생성자;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽2 {
	boolean check = false;
	public 나의그래픽2() {
		JFrame f = new JFrame("나의아이유");
		f.setSize(200,500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);		
		JLabel lable = new JLabel();
		lable.setText("아이유, 설현 그림변환");
		f.getContentPane().add(lable);				
		JButton img = new JButton();
		ImageIcon icon1 = new ImageIcon("001.jpg");
		img.setIcon(icon1);		
		JButton push = new JButton("나를눌러주세요");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼을눌렀군요.");
				if(check == false) {
				ImageIcon icon2 = new ImageIcon("002.jpg");
				img.setIcon(icon2);
				lable.setText("설현");
				check = true;
				}
				else {
					img.setIcon(icon1);
					lable.setText("아이유");
					check = false;					
				}				
			}
		});
		f.getContentPane().add(push);	
		f.getContentPane().add(img);
		JLabel result = new JLabel("결과값 출력");
		
		JTextField t1 = new JTextField(10);//글짜수 지정
		JTextField t2 = new JTextField(10);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		JButton push2 = new JButton("더한 결과값 확인:");
		push2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				result.setText(i1+i2+"");
			}
		});
		f.getContentPane().add(push2);
		f.getContentPane().add(result);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		나의그래픽2 name = new 나의그래픽2();
		}
}
