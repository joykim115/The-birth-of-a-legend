package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일저장2 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("text2.txt");
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("입력");
			file.write(data+"\n");
			
		}
		
		//스트림 제거
		file.close();
	}

}
