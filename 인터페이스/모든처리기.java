package �������̽�;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ���ó���� implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String who = e.getActionCommand();//������ �� �� �ִ� ���
		JOptionPane.showMessageDialog(null, who+"�� �����̱���");
		if(who.equals("������ȣ")) {
			JOptionPane.showMessageDialog(null, "�����ϼ���");
		}else if(who.equals("�����ȣ")) {
			JOptionPane.showMessageDialog(null, "�����", "�����ȣ�޽���", JOptionPane.WARNING_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "�����մϴ�", "�Ķ��޽���", JOptionPane.OK_CANCEL_OPTION);
		}
	}
}
