package demo.lab5.polymophism;

public class ICICI extends Bank {

	@Override
	public void loadInterest() {
		System.out.println("ICICI : 5.5%");
	}
}
