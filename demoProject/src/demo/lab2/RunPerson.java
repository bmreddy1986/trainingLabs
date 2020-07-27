package demo.lab2;

import demo.lab1.Person;

public class RunPerson {
	static Person p = new Person("Manohar", 10);
	static Person p1 = new Person("Sai", 30);
	
	public static void main(String[] args) {
		p.printData();
		p1.printData();
	}

}
