package ���������;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class �ϱ��� {
	private JTextField t1;
	private JTextField t2;
	public �ϱ���() {
		JFrame f = new JFrame("�ϱ���");
		f.setSize(500, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("<<\uC77C\uAE30\uC7A5\uB0A0\uC9DC>>>>>>");
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(30);
		
		JLabel lblNewLabel_1 = new JLabel("<<\uC77C\uAE30\uC7A5\uC81C\uBAA9>>>>>>");
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(30);
		
		JLabel lblNewLabel_2 = new JLabel("<<\uC77C\uAE30\uC7A5\uB0B4\uC6A9>>");
		f.getContentPane().add(lblNewLabel_2);
		
		JTextArea t3 = new JTextArea();
		t3.setRows(10);
		t3.setColumns(60);
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("\uD30C\uC77C\uC800\uC7A5\uD558\uAE30");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//��¥�� �����ٰ� ���� �̸��� �������Ѵ�.
				// ���Ͽ� ��¥, ����, ������ ����
				// ���� ��Ʈ���� �ݾƾ��Ѵ�.				
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
					try {
						FileWriter file = new FileWriter(s1+"�ϱ���.txt");
						file.write(s1+"\n");
						file.write(s2+"\n");
						file.write(s3+"\n");
						file.close();
						t1.setText("");
						t2.setText("");
						t3.setText("");
						JOptionPane.showMessageDialog(null, "�������强��");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "�����������");
						e.printStackTrace();
					}	
				}					
		});
		b1.setFont(new Font("����", Font.PLAIN, 39));
		b1.setBackground(Color.RED);
		f.getContentPane().add(b1);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		�ϱ��� name = new �ϱ���();
	}
	

}
