package 배열심화;

import javax.swing.JOptionPane;

public class StaticTest {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "환영합니다.");// 팝업띠우기
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.println("당신의 이름은 "+name+"입니다.");
		//Stiring name =sc.next();//String입력과 같은거
		
		String input = JOptionPane.showInputDialog("나이 입력");
		int age = Integer.parseInt(input);//분석해서 Int로 봐꿀 수 있으면 봐꾸는 부품
		System.out.println("내년 나이는"+(age+1)+"입니다.");
	}

}
