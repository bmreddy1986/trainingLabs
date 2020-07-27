package demo.lab5.polymophism;

import java.util.Scanner;

public class BankDemoRun {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		Bank bank = new Bank();
		
		if("ICICI".equals(str)) {
			
			bank = new ICICI();
			bank.loadInterest();
			
		} else if("HDFC".equals(str)) {
			
			bank = new HDFC();
		
		} else if("SBI".equals(str)) {
			
			bank = new SBI();
		
		} else {
			
			System.out.println("bank not supported");
			
		}
		
		if(null != bank)
			bank.loadInterest();
			
		
	}

}
