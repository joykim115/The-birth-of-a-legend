package 파일입출력;

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

public class 일기장 {
	private JTextField t1;
	private JTextField t2;
	public 일기장() {
		JFrame f = new JFrame("일기장");
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
				//날짜를 가져다가 파일 이름을 만들어야한다.
				// 파일에 날짜, 제목, 내용을 저장
				// 파일 스트림을 닫아야한다.				
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
					try {
						FileWriter file = new FileWriter(s1+"일기장.txt");
						file.write(s1+"\n");
						file.write(s2+"\n");
						file.write(s3+"\n");
						file.close();
						t1.setText("");
						t2.setText("");
						t3.setText("");
						JOptionPane.showMessageDialog(null, "파일저장성공");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "파일저장실패");
						e.printStackTrace();
					}	
				}					
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 39));
		b1.setBackground(Color.RED);
		f.getContentPane().add(b1);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		일기장 name = new 일기장();
	}
	

}
