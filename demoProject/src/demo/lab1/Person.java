package demo.lab1;

public class Person {

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String name = "Manohar";
	public int age = 10;
	public static boolean hasEyes = true;
	
	public void printData() {
		System.out.println("\nName: "+name);
		System.out.println("Age: "+age);
		System.out.println("Has Eyes:"  + hasEyes);
	}
}
