package 파일입출력;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) throws Exception{
		Document doc = Jsoup.connect("https://www.w3schools.com/").get();
//		System.out.println(doc);
		Elements elist = doc.select("h4.w3-margin-top");//선택해서 가져오기
		System.out.println(elist);
		
		
		FileWriter file = new FileWriter("w3c.txt");
		
		for (Element element : elist) {// 컨트롤+시프트+O 참조할 문서 설정(Soup설정)
			System.out.println(element.text());//TAG(<> 사이에 있는 값만 호출 
			file.write(element.text()+"\n");
		}
		file.close();
	}

}
