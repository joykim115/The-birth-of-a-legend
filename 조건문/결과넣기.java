package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ����ֱ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� ù �׷���");//Ÿ��Ʋ ����
		f.setSize(500, 500); // ũ�� ����
		
		JButton top = new JButton("New button");
		JButton sub = new JButton("New button");
		JButton middle = new JButton("New button");

		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top�� �����̱���");
				f.setTitle("top�� �����̱���.");
				sub.setText("top�� �����̱���");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setVisible(true); // ���̰� �Ѵ�

	}

}
