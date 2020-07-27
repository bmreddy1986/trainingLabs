package demo.lab3.staticexample;

public class RunByke {

	static {
		System.out.println("static block 1");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	public static void main(String[] args) {
		Byke.printData();
		System.out.println("Name : "+ Byke.name);
	}
	
}
