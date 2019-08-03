package ���������;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�3 {

		public static void main(String[] args) throws Exception {
			String[] code = {"005360", "005930", "068270"};//�ֽ� ����
			String[] company = {"�𳪹�", "�Ｚ����", "��Ʈ����"};
			for (int i = 0; i < company.length; i++) {

				Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+code[i]).get();
				Elements elist = doc.select("span.blind");// �����ͺ��� �ݾ��� ���� ������
								
				System.out.println(company[i]);
				System.out.println("-------------");				
				String high = elist.get(17).text();
				String today = elist.get(12).text();
				String low = elist.get(15).text();			
				System.out.println("���Ѱ�: "+high);
				System.out.println("���簡: "+today);
				System.out.println("���Ѱ�: "+low);
				System.out.println("-------------");
				
				FileWriter file = new FileWriter(company[i]+".txt");
				file.write("���Ѱ�: "+high+"\n");
				file.write("���簡: "+today+"\n");
				file.write("���Ѱ�: "+low+"\n");
				file.close();							
			}			
		}
	}

