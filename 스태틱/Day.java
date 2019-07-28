package 스태틱;

public class Day {
String doing;
int time;
String location; // 복제된 주소가 동적으로 새로 생성
static int count; // 복제된 주소와 상관 없이 정적으로 생성
static int sum;

//변수 값들 저장
public Day(String study, int time, String location) {
	count++;
	sum = sum + time; // 쌓인 시간에 계속 더하기
	System.out.println(count);
	this.doing = study;
	this.time = time;
	this.location = location;
	
	}

//변수값들 출력
@Override
public String toString() {
	return doing + "," + time + "," + location;
}




}
