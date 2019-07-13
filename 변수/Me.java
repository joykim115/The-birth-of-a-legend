package 변수;

public class Me {
/* 주석다는법: 엄청 길게 가능 반드시 종료 표시 해줘야함
 * 작성자 : 김조이
 * 날짜:2019. 07. 13
 * 수정내용: 뿅뿅
 */
// 주석다는법 한줄씩 하는거
	public static void main(String[] args) {
		byte age; //선언 =>메모리 공간 확보(byte 127까지)
		age = 100; //= => 할당연산자, 대입연산자
		int money = 10;
		double weight = 100;
        float eye = 1.3f;
        /*플롯은 뒤에 f를 붙여줘야 1.30~으로 
             오인식해 메모리 부족을 걱정 안함*/
        char gender = '남';
        String name = "홍길동";
        boolean lunch = true;//false        
        System.out.println("내 이름은:"+name);
		System.out.println("내 나이: "+age);
		//앞에 문자("") 추가하고 + 붙이면 연결됨
		System.out.println("내 돈은:"+money);
		System.out.println("내 몸무게는:"+weight);
		System.out.println("내 시력은:"+eye);
		System.out.println("내 성별은:" + gender);
		System.out.println("점심은 맛있게 드셨나요:"+lunch);
	}
}
