package ���������;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �ϱ���α��� {
	private JTextField t1;
	private JTextField t2;

	public �ϱ���α���() {
		JFrame f = new JFrame("�����ϱ���");
		f.setSize(500, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-06\\Desktop\\\uC0C8\uD3F4\uB3541\\15.png"));
		f.getContentPane().add(label);
		
		JLabel lblId = new JLabel("ID\uC785\uB825:");
		f.getContentPane().add(lblId);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PW\uC785\uB825:");
		f.getContentPane().add(lblNewLabel);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778\uCC98\uB9AC");
		btnNewButton.addActionListener(new ActionListener() {// ��ư�� ������
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("�Է�id"+s1);
				System.out.println("�Է�pw"+s2);	
				String id = "root";
				String pw = "1234";
				if (id.equals(s1) && pw.equals(s2)) {
					System.out.println("�α���yes");	
					�ϱ��� diary = new �ϱ���();
				}else {
					System.out.println("�α���no");
					JOptionPane.showMessageDialog(null, "�ٽ÷α������ּ���");
					t1.setText("");//�α��� ���н� ����ó��
					t2.setText("");
				}				
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("����", Font.PLAIN, 48));
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		�ϱ���α��� name = new �ϱ���α���();
	}

}
