package ������;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���5 {
	public static void main(String[] args) {
		JFrame	f = new JFrame("���� ��ȭ �ٹ�");
		f.setSize(240, 300);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);			
		JButton img = new JButton();
		ImageIcon icon1 = new ImageIcon("003.jpg");
		img.setIcon(icon1);
		f.getContentPane().add(img);		
		JButton t1 = new JButton("�");
		JButton t2 = new JButton("��");
		JButton t3 = new JButton("�丣�ҳ�");		
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					ImageIcon icon1 = new ImageIcon("003.jpg");
					img.setIcon(icon1);				
			}
		});
		f.getContentPane().add(t1);		
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					ImageIcon icon1 = new ImageIcon("004.jpg");
					img.setIcon(icon1);
			}
		});
		f.getContentPane().add(t2);		
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					ImageIcon icon1 = new ImageIcon("005.jpg");
					img.setIcon(icon1);
			}
		});
		f.getContentPane().add(t3);		
		f.setVisible(true);		
	}
}
