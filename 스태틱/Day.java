package ����ƽ;

public class Day {
String doing;
int time;
String location; // ������ �ּҰ� �������� ���� ����
static int count; // ������ �ּҿ� ��� ���� �������� ����
static int sum;

//���� ���� ����
public Day(String study, int time, String location) {
	count++;
	sum = sum + time; // ���� �ð��� ��� ���ϱ�
	System.out.println(count);
	this.doing = study;
	this.time = time;
	this.location = location;
	
	}

//�������� ���
@Override
public String toString() {
	return doing + "," + time + "," + location;
}




}
