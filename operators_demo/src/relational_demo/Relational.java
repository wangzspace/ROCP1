package relational_demo;

public class Relational {
	public static void main (String args[]) {
		
		int x = 5;
		int y = 12;
		int z = 5;
		
		System.out.println(x + " is equal to " + y + ": " + equal(x,y));
		System.out.println(x + " is greater or equal to " + y + ": " + greatereq(x,y));
		System.out.println(x + " is greater than " + y + ": " + greater(x,y));
		System.out.println(x + " is less or equal to " + y + ": " + lesseq(x,y));
		System.out.println(x + " is less than " + y + ": " + less(x,y));
		System.out.println(x + " is not equal to " + y + ": " + noteq(x,y));
		
		System.out.println(x + " is equal to " + z + ": " + equal(x,z));
		System.out.println(x + " is greater or equal to " + z + ": " + greatereq(x,z));
		System.out.println(x + " is greater than " + z + ": " + greater(x,z));
		System.out.println(x + " is less or equal to " + z + ": " + lesseq(x,z));
		System.out.println(x + " is less than " + z + ": " + less(x,z));
		System.out.println(x + " is not equal to " + z + ": " + noteq(x,z));
		
	}
	
	// Check if two numbers are equal
	public static boolean equal(int a, int b) {
		return a == b;
	}
	
	// Check if a number if greater than or equal to another number
	public static boolean greatereq(int a, int b) {
		return a >= b;
	}
	
	// Check if a number if greater than another number
	public static boolean greater(int a, int b) {
		return a > b;
	}
	
	// Check if a number if less than or equal to another number
	public static boolean lesseq(int a, int b) {
		return a <= b;
	}
	
	// Check if a number if less than another number
	public static boolean less(int a, int b) {
		return a < b;
	}
	
	// Check if two numbers are not equal
	public static boolean noteq(int a, int b) {
		return a != b;
	}
	
}
