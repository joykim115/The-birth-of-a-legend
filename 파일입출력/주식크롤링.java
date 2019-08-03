package 파일입출력;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 주식크롤링 {
	private JTextField code;

	public 주식크롤링() {
		JFrame f = new JFrame("나의 주식");
		f.setSize(202, 355);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JTextArea result = new JTextArea();
		
		JButton t1 = new JButton("\uBAA8\uB098\uBBF8");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Document doc;
				try {
					result.setText("");
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
					Elements elist = doc.select("span.blind");// 가져와보니 금액은 여기 모여있음
					String high = elist.get(17).text();
					String today = elist.get(12).text();
					String low = elist.get(15).text();
					result.append(high+"\n");
					result.append(today+"\n");
					result.append(low+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t1);
		
		JButton t2 = new JButton("\uC0BC\uC131\uC804\uC790");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Document doc;
				try {
					result.setText("");
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();
					Elements elist = doc.select("span.blind");// 가져와보니 금액은 여기 모여있음
					String high = elist.get(17).text();
					String today = elist.get(12).text();
					String low = elist.get(15).text();
					result.append(high+"\n");
					result.append(today+"\n");
					result.append(low+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		});
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t2);
		
		JButton t3 = new JButton("\uC140\uD2B8\uB9AC\uC628");
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Document doc;
				try {
					result.setText("");
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
					Elements elist = doc.select("span.blind");// 가져와보니 금액은 여기 모여있음
					String high = elist.get(17).text();
					String today = elist.get(12).text();
					String low = elist.get(15).text();
					result.append(high+"\n");
					result.append(today+"\n");
					result.append(low+"\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
				
			}
		});
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("code:");
		f.getContentPane().add(lblNewLabel);
		
		code = new JTextField();
		f.getContentPane().add(code);
		code.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\uD06C\uB864\uB9C1\uC2DC\uC791");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Document doc;
				try {
					String cc = code.getText();
					result.setText("");
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+cc).get();
					Elements elist = doc.select("span.blind");// 가져와보니 금액은 여기 모여있음
					String high = elist.get(17).text();
					String today = elist.get(12).text();
					String low = elist.get(15).text();
					result.append(high+"\n");
					result.append(today+"\n");
					result.append(low+"\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			}
		});
		f.getContentPane().add(btnNewButton_3);
		
		result.setRows(5);
		result.setColumns(15);
		f.getContentPane().add(result);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		주식크롤링 name = new 주식크롤링();
	}

}
