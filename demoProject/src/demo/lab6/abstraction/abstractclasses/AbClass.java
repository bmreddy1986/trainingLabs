package demo.lab6.abstraction.abstractclasses;

import demo.lab6.abstraction.interfaces.BaseInter;

public abstract class AbClass implements BaseInter {
	
	@Override
	public void method1() {
		System.out.println("method 1");
	}
	
	public static final String field1 = "value";

	protected void concreteMethod() {
		System.out.println("concrete method");
		concreteMethod1();
	}
	
	private void concreteMethod1() {
		System.out.println("concrete method1");
	}
	
	protected void concreteMethod3() {
		System.out.println("concrete method1");
	}
	
	protected abstract void abstractMethod();
	
	//protected abstract void abstractMethod2();
	
}
