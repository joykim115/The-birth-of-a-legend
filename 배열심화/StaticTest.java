package �迭��ȭ;

import javax.swing.JOptionPane;

public class StaticTest {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ȯ���մϴ�.");// �˾�����
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		System.out.println("����� �̸��� "+name+"�Դϴ�.");
		//Stiring name =sc.next();//String�Է°� ������
		
		String input = JOptionPane.showInputDialog("���� �Է�");
		int age = Integer.parseInt(input);//�м��ؼ� Int�� ���� �� ������ ���ٴ� ��ǰ
		System.out.println("���� ���̴�"+(age+1)+"�Դϴ�.");
	}

}
