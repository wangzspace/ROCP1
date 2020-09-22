package conditional_operators_demo;
import relational_demo.Relational;

public class Conditional {
	public static void main (String args[]) {
		
		int a = 2;
		int b = 3;
		int c = 4;
		int d = 3;
		
		// If statements using the methods from the Relational operators package
		if (Relational.equal(a,b)) {
			System.out.println(d + " and " + b + " are equal.");
		}
		else if (Relational.greater(c, a)) {
			System.out.println(c + " is greater than " + a + ".");
		}
		else {
			System.out.println("");
		}
		if (Relational.less(c, c)) {
			System.out.println(c + " is less than " + c + ".");
		}
		else if (Relational.noteq(b,d)) {
			System.out.println(b + " is not equal to " + d + ".");
		}
		else {
			System.out.println("No equalities correct.");
		}

	}
	
}
