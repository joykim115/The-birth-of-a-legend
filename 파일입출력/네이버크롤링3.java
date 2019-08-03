package 파일입출력;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링3 {

		public static void main(String[] args) throws Exception {
			String[] code = {"005360", "005930", "068270"};//주식 정보
			String[] company = {"모나미", "삼성전자", "셀트리온"};
			for (int i = 0; i < company.length; i++) {

				Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+code[i]).get();
				Elements elist = doc.select("span.blind");// 가져와보니 금액은 여기 모여있음
								
				System.out.println(company[i]);
				System.out.println("-------------");				
				String high = elist.get(17).text();
				String today = elist.get(12).text();
				String low = elist.get(15).text();			
				System.out.println("상한가: "+high);
				System.out.println("현재가: "+today);
				System.out.println("하한가: "+low);
				System.out.println("-------------");
				
				FileWriter file = new FileWriter(company[i]+".txt");
				file.write("상한가: "+high+"\n");
				file.write("현재가: "+today+"\n");
				file.write("하한가: "+low+"\n");
				file.close();							
			}			
		}
	}

