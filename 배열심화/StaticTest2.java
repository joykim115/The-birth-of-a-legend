package �迭��ȭ;

import javax.swing.JOptionPane;

public class StaticTest2 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("�����Է�1");
		int num2 = Integer.parseInt(num1);
		String num3 = JOptionPane.showInputDialog("�����Է�2");
		int num4 = Integer.parseInt(num3);
		
		JOptionPane.showConfirmDialog(null, "����?"+(num2+num4));
		
	}

}
