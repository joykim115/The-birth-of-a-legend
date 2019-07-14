package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽");//타이틀 설정
		f.setSize(500, 500); // 크기 지정
		
		JButton button = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운대 버튼을 눌렀군요.");
			}
		});
		button.setBackground(Color.YELLOW);
		button.setForeground(Color.BLUE);
		button.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(button, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uC704\uC5D0 \uBC84\uD2BC");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("위에 버튼을 눌렀군요.");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 31));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\uC67C\uCABD\uBC84\uD2BC");
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uC624\uB978\uCABD\uBC84\uD2BC");
		btnNewButton_2.setForeground(Color.MAGENTA);
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("\uC544\uB798\uBC84\uD2BC");
		btnNewButton_3.setForeground(Color.MAGENTA);
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		f.setVisible(true); // 보이게 한다

	}

}
