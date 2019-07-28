package 스태틱;

public class dayuser {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
//		int total = day1.time+day2.time+day3.time;
		System.out.println("전체시간:"+Day.sum);
		
		int average = Day.sum/Day.count;	// 클래스+count	
		System.out.println("전체평균:"+average);
		
		}

}
