package demo.lab4.inheritence.multilevel;

public class MultiLevelInheritenceRun {
	
	static C c = new C();
	
	static D d = new D();
	
	
	public static void main(String[] param) {
		c.method1();
		c.method2();
		c.method3();
		System.out.println(c.field1);
		
	}

}


