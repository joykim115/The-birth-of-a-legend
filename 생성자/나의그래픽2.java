package ������;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���2 {
	boolean check = false;
	public ���Ǳ׷���2() {
		JFrame f = new JFrame("���Ǿ�����");
		f.setSize(200,500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);		
		JLabel lable = new JLabel();
		lable.setText("������, ���� �׸���ȯ");
		f.getContentPane().add(lable);				
		JButton img = new JButton();
		ImageIcon icon1 = new ImageIcon("001.jpg");
		img.setIcon(icon1);		
		JButton push = new JButton("���������ּ���");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("��ư����������.");
				if(check == false) {
				ImageIcon icon2 = new ImageIcon("002.jpg");
				img.setIcon(icon2);
				lable.setText("����");
				check = true;
				}
				else {
					img.setIcon(icon1);
					lable.setText("������");
					check = false;					
				}				
			}
		});
		f.getContentPane().add(push);	
		f.getContentPane().add(img);
		JLabel result = new JLabel("����� ���");
		
		JTextField t1 = new JTextField(10);//��¥�� ����
		JTextField t2 = new JTextField(10);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		JButton push2 = new JButton("���� ����� Ȯ��:");
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
		���Ǳ׷���2 name = new ���Ǳ׷���2();
		}
}
