package arithemetic_demo;

public class Arithmetic {

	public static void main(String[] args) {

		int x = 13;
		int y = 3;
		
		System.out.println(x + " plus " + y + " is " + add(x,y));
		System.out.println(x + " minus " + y + " is " + sub(x,y));
		System.out.println(x + " multiplied by " + y + " is " + mult(x,y));
		System.out.println(x + " divided by " + y + " is " + div(x,y));
		System.out.println("The remainder for " + x + "/" + y + " is " + mod(x,y));
		System.out.println(x + " incremented by 1 is " + inc(x));
		System.out.println(x + " decremented by 1 is " + dec(x));

	}
	
	// Returns addition of two integers
	public static int add(int a, int b) {
		return a + b;
	}
	
	// Returns subtraction of two integers
	public static int sub(int a, int b) {
		return a- b;
	}
	
	// Returns product of two integers
	public static int mult(int a, int b) {
		return a * b;
	}
	
	// Returns quotient of two integers
	public static double div (double a, double b) {
		return a/b;
	}
	
	// Returns remainder of two integers
	public static int mod(int a, int b) {
		return a%b;
	}
	
	// Returns integer incremented by 1
	public static int inc(int a) {
		return ++a;
	}
	
	// Returns integer decremented by 1
	public static int dec(int a) {
		return --a;
	}

}
