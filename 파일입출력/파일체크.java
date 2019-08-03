package 파일입출력;

import java.io.File;
import java.util.Iterator;

public class 파일체크 {

	public static void main(String[] args) {
		File file = new File("D:\\학생방\\day07");//파일이 저장된 폴더 불러오기
		System.out.println(file.exists());//실제 존재하니?
		System.out.println(file.isDirectory());//폴더니?
		System.out.println(file.isFile());//파일이니?
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);//파일 리스트 출력 - 단 자바가 파일로 인식하는건 추가 조치 필요
		}
		System.out.println(list.length);//파일 개수 확인
	}

}
