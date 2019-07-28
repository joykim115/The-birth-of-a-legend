package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장 {
	public static void main(String[] args) throws Exception {
		//외부 자원을 연결할때
		//파일을 다룰때 : 파일, 네트워크, db
		//무조건 에러처리 해야함
		FileWriter file = new FileWriter("test.txt");
		file.write("hello java"+"\n");// + "\n" 엔터
		file.write("byebye"+"\n");
		file.close();
	}
}
