package demo.lab5.polymophism;

public class SBI extends Bank {

	@Override
	public void loadInterest() {
		System.out.println("SBI : 2.5%");
	}
}
