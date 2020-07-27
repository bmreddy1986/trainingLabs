package demo.lab7.constructor;

public class Employee {

	public String name;;
	public transient int id;
	
	public Employee() {
		System.out.println("object create");
		name = "Demo";
		id = 100;
	}
	
	public Employee(String a) {
		this();
	}
	
	public Employee(String a, int b) {
		System.out.println("constructor execute");
		name = a;
	}
	
	public int getId() {
		return id;
	}
	
	

}
