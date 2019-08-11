package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class 모든처리기 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String who = e.getActionCommand();//누군지 알 수 있는 기능
		JOptionPane.showMessageDialog(null, who+"를 누르셨군요");
		if(who.equals("빨강신호")) {
			JOptionPane.showMessageDialog(null, "조심하세요");
		}else if(who.equals("노랑신호")) {
			JOptionPane.showMessageDialog(null, "노랑이", "노랑신호메시지", JOptionPane.WARNING_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "안전합니다", "파랑메시지", JOptionPane.OK_CANCEL_OPTION);
		}
	}
}
