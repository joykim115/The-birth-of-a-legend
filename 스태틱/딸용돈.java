package ����ƽ;

import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���뵷 {
	static int count; // ��ü���� �� ���� �ȵ�
	int dongCount = 0;
	int sonCount = 0;

	public ���뵷() {
		JFrame f = new JFrame("���뵷���");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(200, 300);
		JLabel l1 = new JLabel("�� �̸�:");
		JLabel l2 = new JLabel("�� ����:");
		JLabel l3 = new JLabel("�ƺ����� �ܾ�:");
		JTextField name = new JTextField(10);
		JTextField age = new JTextField(10);
		JButton daddy = new JButton("�ƺ� �뵷 �ּ���");
		JTextArea list = new JTextArea(5,10); //�Խ��� �۾��� 
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String s1 = name.getText();
					String s2 = age.getText();
					int agei = Integer.parseInt(s2);
					�� d1 = new ��(s1, agei);
					int result = ��.wallet;
					l3.setText("�ܾ�:" + result + "��");
					if (s1.equals("ȫ�浿")) {
						dongCount++;
						JOptionPane.showMessageDialog(null, s1+","+dongCount * 1000); // ���־��°� Static���� �̸� ������
						list.append(d1+"\n");
					}
					else if (s1.equals("ȫ���")) {
						sonCount++;
						JOptionPane.showMessageDialog(null, s1+","+sonCount * 1000); // ���־��°� Static���� �̸� ������
						list.append(d1+"\n");
					} else {
						JOptionPane.showMessageDialog(null, "�ش�� �̸� ����"); // ���־��°� Static���� �̸� ������						
				}

			}
		});
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l1);
		f.getContentPane().add(name);
		f.getContentPane().add(l2);
		f.getContentPane().add(age);
		f.getContentPane().add(daddy);
		f.getContentPane().add(l3);
		f.add(list);
		f.setVisible(true);
	}
	public static void main(String[] args) {// ������ ����Ǿ��ϴϱ� Static�� �� �� �ۿ� ���� ���� X
		System.out.println(count);
		���뵷 name = new ���뵷();
	}
}
