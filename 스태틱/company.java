package ½ºÅÂÆ½;

public class company {
	
	String name;
	int age;
	char gender;
	static int total;
	static int count;
	static int average;

	
	public company(String name, int age, char gender) {
		count ++;
		total = total + age;
		average=total/count;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "company [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}

