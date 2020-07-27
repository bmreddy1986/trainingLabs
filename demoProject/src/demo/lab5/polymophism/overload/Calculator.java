package demo.lab5.polymophism.overload;

public class Calculator {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int x, int y, int z) {
		return x+y+z;
	}

	public float sum(float a, float b) {
		return a+b;
	}
	
	public float sum(float a, int b) {
		return a+b;
	}
	
	public static long sum(long a, long b) {
		return a+b;
	}
	
	public static long sum(long a, long b, long c) {
		return a+b+c;
	}
}
