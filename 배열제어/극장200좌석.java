package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ����200�¼� extends JFrame {

	public ����200�¼�() {
		setTitle("200�¼� ���忹��");
		setSize(620, 700);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		JButton[] buttons = new JButton[200];
		
		Color[] color = {Color.yellow, Color.pink, Color.green, Color.blue};
		Random r = new Random();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "");// i�� ��Ʈ���̶� String���� �ֱ� ���� +""�߰�
			
			int index = r.nextInt(4);
			buttons[i].setBackground(color[index]);
			
			getContentPane().add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("����");
					String data = e.getActionCommand();
					System.out.println(data);// 1
					if (!data.equals("����")) {
						int data2 = Integer.parseInt(data);
						buttons[data2].setText("����");
						buttons[data2].setEnabled(false);
					}
				}
			});
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		����200�¼� name = new ����200�¼�();
	}
}
