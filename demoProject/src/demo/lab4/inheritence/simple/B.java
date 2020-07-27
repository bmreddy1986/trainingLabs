package demo.lab4.inheritence.simple;

public class B extends A {
	
	public String field2 = "value2";
	
	@Override
	public void method1() {
		super.method1();
		System.out.println("B:method2");
	}

}
