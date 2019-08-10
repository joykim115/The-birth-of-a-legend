package 배열제어;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 극장200좌석 extends JFrame {

	public 극장200좌석() {
		setTitle("200좌석 극장예매");
		setSize(620, 700);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		JButton[] buttons = new JButton[200];
		
		Color[] color = {Color.yellow, Color.pink, Color.green, Color.blue};
		Random r = new Random();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "");// i는 인트값이라 String으로 넣기 위해 +""추가
			
			int index = r.nextInt(4);
			buttons[i].setBackground(color[index]);
			
			getContentPane().add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("예약");
					String data = e.getActionCommand();
					System.out.println(data);// 1
					if (!data.equals("예약")) {
						int data2 = Integer.parseInt(data);
						buttons[data2].setText("예약");
						buttons[data2].setEnabled(false);
					}
				}
			});
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		극장200좌석 name = new 극장200좌석();
	}
}
