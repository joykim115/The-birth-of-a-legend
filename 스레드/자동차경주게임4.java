package ������;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���4 extends JFrame {
	//���� Ŭ����
	//�� Ŭ������ �������� ����ؾ��ϴ� �������� �� Ŭ������ ���������� �ִ� ��� �̸� �ϳ��� Ŭ���� ������ ���ؼ� ��밡��
	public class CarThread extends Thread {
		int x, y;
		ImageIcon icon;
		JLabel label;
		public CarThread(String file, int x, int y) { //������ �����
			this.x = x; //x�� ����
			this.y = y; //y�� ����
			label = new JLabel(file); //�� �����
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
	public �ڵ������ְ���4() {
		setTitle("�ڵ������ְ���"); //JFrame Head �����
		setSize(600, 200);  // ������ ���ϱ�
		JLabel car = new JLabel();
		setLayout(null);// �ڵ����� ��ġ���ִ� Ŭ���� ������� ����
		CarThread car1 = new CarThread("����", 100, 0);
		CarThread car2 = new CarThread("�ƿ��", 100, 50);
		CarThread car3 = new CarThread("������", 100, 100);
		car1.start();
		car2.start();
		car3.start();
		setVisible(true);
	}	public static void main(String[] args) {
		�ڵ������ְ���4 name = new �ڵ������ְ���4();
	}}
