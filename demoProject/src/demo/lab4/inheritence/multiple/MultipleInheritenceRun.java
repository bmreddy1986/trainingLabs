package demo.lab4.inheritence.multiple;

public class MultipleInheritenceRun {
	
	static C c = new C();
	
	static B b = new B();
	
	public static void main(String[] param) {
		b.method1();
		
		
		c.method3();
		System.out.println(c.field1);
		
	}

}


