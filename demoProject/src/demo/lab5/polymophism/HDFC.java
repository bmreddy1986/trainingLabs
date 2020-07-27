package demo.lab5.polymophism;

public class HDFC extends Bank {

	@Override
	public void loadInterest() {
		System.out.println("HDFC : 4.5%");
	}
}
