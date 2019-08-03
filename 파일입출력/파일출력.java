package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;

public class 파일출력 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test.txt");
		file.write("자바"+"\n"); // \n=엔터
		file.write("스프링"+"\n");
		file.close();//끝.
		//file과 java와의 연결통로를 stream(스트림)이라고 부름
		//stream을 통해서 데이터 file에 씀
		//stream을 닫으면 파일의 작성이 끝
	}

}
