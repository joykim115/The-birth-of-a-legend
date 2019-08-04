package 상속2;

public class 대학생 extends 학생 {
	@Override
	//↑Annotation(표시)
	//Override 확인용도
	//특정한 처리 삽입가능 (Bean, 1000줄 실행)
	public void 공부하다() {
		System.out.println("대학다니기");
	}

}
