package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {
	
	public 나의그래픽() {
		JFrame f = new JFrame("나의그래픽");
		f.setSize(500, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //순서대로 추가되는 레이아웃임
		
		ImageIcon icon1 = new ImageIcon("001.jpg");
		JButton b1 = new JButton();
		b1.setIcon(icon1);
		//add는 frame에 올려준다.
		f.add(b1);
		
		JButton b2 = new JButton("나도 버튼");
		f.add(b2);
		
		JButton b3 = new JButton("세번째버튼");
		f.add(b3);
		
		ImageIcon icon4 = new ImageIcon("005.png");//이미지인식시키기
		
		JButton b4 = new JButton(icon4);
		f.add(b4);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		나의그래픽 me = new 나의그래픽();
	}
	

}
