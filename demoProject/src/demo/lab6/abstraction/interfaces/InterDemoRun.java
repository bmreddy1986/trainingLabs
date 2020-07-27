package demo.lab6.abstraction.interfaces;

public class InterDemoRun {

	public static void main(String[] args) {
		BaseInter base = new SubClassToInterface();
		
		base.method1();
	}

}
