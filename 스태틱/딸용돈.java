package 스태틱;

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

public class 딸용돈 {
	static int count; // 객체생성 전 접근 안됨
	int dongCount = 0;
	int sonCount = 0;

	public 딸용돈() {
		JFrame f = new JFrame("딸용돈장부");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(200, 300);
		JLabel l1 = new JLabel("딸 이름:");
		JLabel l2 = new JLabel("딸 나이:");
		JLabel l3 = new JLabel("아빠지갑 잔액:");
		JTextField name = new JTextField(10);
		JTextField age = new JTextField(10);
		JButton daddy = new JButton("아빠 용돈 주세요");
		JTextArea list = new JTextArea(5,10); //게시판 글쓰는 
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String s1 = name.getText();
					String s2 = age.getText();
					int agei = Integer.parseInt(s2);
					딸 d1 = new 딸(s1, agei);
					int result = 딸.wallet;
					l3.setText("잔액:" + result + "원");
					if (s1.equals("홍길동")) {
						dongCount++;
						JOptionPane.showMessageDialog(null, s1+","+dongCount * 1000); // 자주쓰는건 Static으로 미리 만들어놈
						list.append(d1+"\n");
					}
					else if (s1.equals("홍길순")) {
						sonCount++;
						JOptionPane.showMessageDialog(null, s1+","+sonCount * 1000); // 자주쓰는건 Static으로 미리 만들어놈
						list.append(d1+"\n");
					} else {
						JOptionPane.showMessageDialog(null, "해당딸 이름 없음"); // 자주쓰는건 Static으로 미리 만들어놈						
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
	public static void main(String[] args) {// 예부터 실행되야하니깐 Static이 될 수 밖에 없음 동적 X
		System.out.println(count);
		딸용돈 name = new 딸용돈();
	}
}
