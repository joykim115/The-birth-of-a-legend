package ����ƽ;

public class �� {
	public String name;
	int age;
	static int wallet = 10000;
	static int money = 0;
	static int count = 0;
	
	public ��(String name, int age) {
		if(name.equals("ȫ�浿")) {
		count++;
		money = 1000*count;
		wallet = wallet - 1000;
		this.name = name;
		this.age = age;}
		if(name.equals("ȫ���")) {
			count++;
			money = 1000*count;
			wallet = wallet - 1000;
			this.name = name;
			this.age = age;}
		
		
	}

	@Override
	public String toString() {
		return "�� [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
