package 변수복습;

public class 성적입력 {
	String name;
	int point;
	
	public 성적입력(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}

	@Override
	public String toString() {
		return "성적입력 [name=" + name + ", point=" + point + "]";
	}
}
