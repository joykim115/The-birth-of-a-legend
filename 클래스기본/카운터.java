package Ŭ�����⺻;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ī���� {
    static int count = 0;
    private static final JTextField t1 = new JTextField();
    private static JTextField t2;
	public static void main(String[] args) {
//		������ ��ǰ - 1��
		JLabel l1 = new JLabel("0");
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setTitle("����ī����");
		f.setSize(350,500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7901");
		f.getContentPane().add(lblNewLabel_1);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(t1);
		t1.setColumns(7);
		
		JLabel lblNewLabel_2 = new JLabel("\uC22B\uC7902");
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(t2);
		t2.setColumns(7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-06\\Desktop\\\uC0C8 \uD3F4\uB354\\170CB94D4F68A5EA082.png"));
		f.getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("-");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("-��ư�� �����̱���");
//				count--;
//				�� ���� ���ڰ��� ������ �;��Ѵ�.
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1+", "+s2);
//				��� �Է°��� �� String->int�� ��ȯ
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
//				-����
				int n3 = n1-n2;
//				����� �־��� 
				l1.setText(n3+"");//���ڷ� �νĽ�Ű�� ����
			}
		});
		b1.setBackground(Color.GREEN);
		b1.setFont(new Font("����", Font.PLAIN, 99));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("0");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0��ư�� �����̱���");
				l1.setText(count+"");
				t1.setText("");
				t2.setText("");
			}
		});
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("����", Font.PLAIN, 99));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("+");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("+��ư�� �����̱���");
//				count++;
//				�� ���� ���ڰ��� ������ �;��Ѵ�.
				String s3 = t1.getText();
				String s4 = t2.getText();
//				��� �Է°��� �� String->int�� ��ȯ
				int n3 = Integer.parseInt(s3);
				int n4 = Integer.parseInt(s4);
//				+����
				int n5 = n3+n4;
//				����� �־��� 
				l1.setText(n5+"");//���ڷ� �νĽ�Ű�� ����
			}
		});
		b3.setBackground(Color.RED);
		b3.setFont(new Font("����", Font.PLAIN, 99));
		f.getContentPane().add(b3);
		
		l1.setForeground(Color.RED);
		l1.setFont(new Font("����", Font.PLAIN, 76));
		f.getContentPane().add(l1);

//		��ġ ��ǰ - 1��

//		��(�̹���, ����) ��ǰ - 2��

//		�̹��� ��ǰ - 1��

//		��ư ��ǰ - 3��
		f.setVisible(true);


	}

}
