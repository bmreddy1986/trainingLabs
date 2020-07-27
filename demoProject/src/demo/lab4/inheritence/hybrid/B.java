package demo.lab4.inheritence.hybrid;

public class B extends A implements Interface1 {
	
	public String field2 = "value2";
	
	public void method2() {
		System.out.println("B:method2");
	}

	@Override
	public void method7() {
		System.out.println("B: method7");
	}

}
