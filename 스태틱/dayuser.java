package ����ƽ;

public class dayuser {

	public static void main(String[] args) {
		Day day1 = new Day("�ڹٰ���", 10, "����");
		Day day2 = new Day("����", 15, "������");
		Day day3 = new Day("�", 11, "��Ʈ�Ͻ�");
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
//		int total = day1.time+day2.time+day3.time;
		System.out.println("��ü�ð�:"+Day.sum);
		
		int average = Day.sum/Day.count;	// Ŭ����+count	
		System.out.println("��ü���:"+average);
		
		}

}
