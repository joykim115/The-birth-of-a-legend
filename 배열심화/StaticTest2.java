package 배열심화;

import javax.swing.JOptionPane;

public class StaticTest2 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("숫자입력1");
		int num2 = Integer.parseInt(num1);
		String num3 = JOptionPane.showInputDialog("숫자입력2");
		int num4 = Integer.parseInt(num3);
		
		JOptionPane.showConfirmDialog(null, "합은?"+(num2+num4));
		
	}

}
