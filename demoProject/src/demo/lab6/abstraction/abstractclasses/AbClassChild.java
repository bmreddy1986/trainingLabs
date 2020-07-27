package demo.lab6.abstraction.abstractclasses;

public class AbClassChild extends AbClass {

	@Override
	protected void abstractMethod() {
		System.out.println("abstract method impl in Child");
	}
	

	
	public void concreteMethod() {
		super.concreteMethod();
		System.out.println("concrete method in Child");
	}

}
