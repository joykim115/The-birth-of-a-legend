package 스레드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임4 extends JFrame {
	//내부 클래스
	//두 클래스간 공통으로 사용해야하는 변수들이 두 클래스에 나누어져서 있는 경우 이를 하나의 클래스 안으로 합해서 사용가능
	public class CarThread extends Thread {
		int x, y;
		ImageIcon icon;
		JLabel label;
		public CarThread(String file, int x, int y) { //생성자 만들기
			this.x = x; //x축 생성
			this.y = y; //y축 생성
			label = new JLabel(file); //라벨 만들기
			label.setBounds(x, y, 100, 100); // 라벨의 위치 잡아주기
			add(label);// 라벨을 JFrame에 더하기
		}
		Random random = new Random();// 랜덤한값 생성
		@Override
		public void run() { //자동차 달리게 하기
			for (int i = 0; i < 100; i++) { // 100번 반복
				x = x + random.nextInt(10);// 10보다 작은값 아무렇게나 생성하여 달리게 하기
				label.setBounds(x, y, 100, 100);// car1.setBounds(x, y, width, height); 라벨 위치 설정
				try {
					Thread.sleep(100);// 0.1초 속도를 늦춰달라는 요청(CPU에), 너무 빨리 달려서 ...
				} catch (Exception e) {
				}			}		}	}
	public 자동차경주게임4() {
		setTitle("자동차경주게임"); //JFrame Head 만들기
		setSize(600, 200);  // 사이즈 정하기
		JLabel car = new JLabel();
		setLayout(null);// 자동으로 배치해주는 클래스 사용하지 안함
		CarThread car1 = new CarThread("벤츠", 100, 0);
		CarThread car2 = new CarThread("아우디", 100, 50);
		CarThread car3 = new CarThread("렉서스", 100, 100);
		car1.start();
		car2.start();
		car3.start();
		setVisible(true);
	}	public static void main(String[] args) {
		자동차경주게임4 name = new 자동차경주게임4();
	}}
