package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ���Ǳ׷��� {
	
	public ���Ǳ׷���() {
		JFrame f = new JFrame("���Ǳ׷���");
		f.setSize(500, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //������� �߰��Ǵ� ���̾ƿ���
		
		ImageIcon icon1 = new ImageIcon("001.jpg");
		JButton b1 = new JButton();
		b1.setIcon(icon1);
		//add�� frame�� �÷��ش�.
		f.add(b1);
		
		JButton b2 = new JButton("���� ��ư");
		f.add(b2);
		
		JButton b3 = new JButton("����°��ư");
		f.add(b3);
		
		ImageIcon icon4 = new ImageIcon("005.png");//�̹����νĽ�Ű��
		
		JButton b4 = new JButton(icon4);
		f.add(b4);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		���Ǳ׷��� me = new ���Ǳ׷���();
	}
	

}
