package 배열;

public class 배열2 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		System.out.println(num[0]);// 데이터의 Index는 0번부터 시작
		System.out.println(num[3]);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		double[] eye = { 0.5, 0.6, 1.0, 2.0, 0.8 };
		System.out.println(eye[2]);
		// 배열은 위치 값을 가지고 접근
		// 위치값=index
		// index는 0부터 시작
		// index의 마지막 값은 개수 -1
		System.out.println(eye.length);// 읽기 전용 변수, 전체 개수 확인용 사용
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}

		String[] name = { "철수", "영희", "바둑이", "순이", "길동" };
		System.out.println(name[0]);
		System.out.println(name[4]);
		System.out.println(name.length);
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		char[] gender = { '남', '여' };
		System.out.println(gender[0]);
		System.out.println(gender[1]);

		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}

	}
}
