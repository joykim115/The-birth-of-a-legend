package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 결과넣기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽");//타이틀 설정
		f.setSize(500, 500); // 크기 지정
		
		JButton top = new JButton("New button");
		JButton sub = new JButton("New button");
		JButton middle = new JButton("New button");

		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top을 누르셨군요");
				f.setTitle("top을 누르셨군요.");
				sub.setText("top을 누르셨군요");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setVisible(true); // 보이게 한다

	}

}
