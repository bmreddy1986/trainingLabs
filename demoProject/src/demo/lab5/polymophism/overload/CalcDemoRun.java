package demo.lab5.polymophism.overload;

public class CalcDemoRun {

public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("\nSum of two floats : " + calc.sum(2.0f,5.4f));
		System.out.println("Sum of int and float : " + calc.sum(2.7f, 5));
		
		System.out.println("\nSum of two longs: " + calc.sum(249505558L, 534343434L));
		System.out.println("Sum of three longs: " + calc.sum(249505558L, 534343434L, 34343434434L));
		
		System.out.println("Sum of two integers: " + calc.sum(3, 8));
		System.out.println("Sum of three integers: " + calc.sum(4, 8, 9));
	}

}
