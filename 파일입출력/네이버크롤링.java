package ���������;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ� {

	public static void main(String[] args) throws Exception{
		Document doc = Jsoup.connect("https://www.w3schools.com/").get();
//		System.out.println(doc);
		Elements elist = doc.select("h4.w3-margin-top");//�����ؼ� ��������
		System.out.println(elist);
		
		
		FileWriter file = new FileWriter("w3c.txt");
		
		for (Element element : elist) {// ��Ʈ��+����Ʈ+O ������ ���� ����(Soup����)
			System.out.println(element.text());//TAG(<> ���̿� �ִ� ���� ȣ�� 
			file.write(element.text()+"\n");
		}
		file.close();
	}

}
