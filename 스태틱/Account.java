package ½ºÅÂÆ½;

public class Account {
	
	String name = null;
	int heigh = 0;
	static int count = 0;
	static int total = 10000;
	
	public Account(String name, int heigh) {
		count++;
		total = total-1000;
		this.name = name;
		this.heigh = heigh;
	}
	

}
