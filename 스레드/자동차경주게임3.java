package ������;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���3 extends JFrame {
	//���� Ŭ����
	//�� Ŭ������ �������� ����ؾ��ϴ� �������� �� Ŭ������ ���������� �ִ� ��� �̸� �ϳ��� Ŭ���� ������ ���ؼ� ��밡��
	public class CarThread extends Thread {
		int x, y;
		ImageIcon icon;
		JLabel label;
		public CarThread(String file, int x, int y) { //������ �����
			this.x = x; //x�� ����
			this.y = y; //y�� ����
			label = new JLabel(); //�� �����
			icon = new ImageIcon(file); // �̹��� �ֱ� �����
			label.setIcon(icon); // icon�� �󺧿� �ֱ�
			label.setBounds(x, y, 100, 100); // ���� ��ġ ����ֱ�
			add(label);// ���� JFrame�� ���ϱ�
		}
		Random random = new Random();// �����Ѱ� ����
		@Override
		public void run() { //�ڵ��� �޸��� �ϱ�
			for (int i = 0; i < 100; i++) { // 100�� �ݺ�
				x = x + random.nextInt(10);// 10���� ������ �ƹ����Գ� �����Ͽ� �޸��� �ϱ�
				label.setBounds(x, y, 100, 100);// car1.setBounds(x, y, width, height); �� ��ġ ����
				try {
					Thread.sleep(100);// 0.1�� �ӵ��� ����޶�� ��û(CPU��), �ʹ� ���� �޷��� ...
				} catch (Exception e) {
				}			}		}	}
	public �ڵ������ְ���3() {
		setTitle("�ڵ������ְ���"); //JFrame Head �����
		setSize(600, 200);  // ������ ���ϱ�
		JLabel car = new JLabel();
		setLayout(null);// �ڵ����� ��ġ���ִ� Ŭ���� ������� ����
		CarThread car1 = new CarThread("car1.gif", 100, 0);
		CarThread car2 = new CarThread("car2.gif", 100, 50);
		CarThread car3 = new CarThread("car3.gif", 100, 100);
		car1.start();
		car2.start();
		car3.start();
		setVisible(true);
	}	public static void main(String[] args) {
		�ڵ������ְ���3 name = new �ڵ������ְ���3();
	}}
