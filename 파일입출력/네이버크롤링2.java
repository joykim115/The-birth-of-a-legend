package 파일입출력;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링2 {

	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("https://www.w3schools.com/html/default.asp").get();
		Elements elist = doc.select("a.w3-bar-item.w3-button");
		System.out.println(elist);
		
		FileWriter file = new FileWriter("bbs.txt");
		
		for (Element element : elist) {
			file.write(element.text()+"\n");
			
		}
		file.close();

	}

}
