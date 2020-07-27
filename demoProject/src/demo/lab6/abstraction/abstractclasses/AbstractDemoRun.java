package demo.lab6.abstraction.abstractclasses;

public class AbstractDemoRun {

	public static void main(String[] args) {
		AbClass ab = new AbClassChild();
		
		ab.abstractMethod();
		ab.concreteMethod();
		ab.concreteMethod3();
	}

}
