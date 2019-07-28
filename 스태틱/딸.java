package ½ºÅÂÆ½;

public class µþ {
	public String name;
	int age;
	static int wallet = 10000;
	static int money = 0;
	static int count = 0;
	
	public µþ(String name, int age) {
		if(name.equals("È«±æµ¿")) {
		count++;
		money = 1000*count;
		wallet = wallet - 1000;
		this.name = name;
		this.age = age;}
		if(name.equals("È«±æ¼ø")) {
			count++;
			money = 1000*count;
			wallet = wallet - 1000;
			this.name = name;
			this.age = age;}
		
		
	}

	@Override
	public String toString() {
		return "µþ [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
