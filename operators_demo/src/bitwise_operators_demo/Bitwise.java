package bitwise_operators_demo;

public class Bitwise {
	public static void main (String args[]) {
		
		int a = 1;  // 01
		int b = 2;  // 10
		int c = 2;  // 10
		
		System.out.println("01 AND 10 is " + Integer.toBinaryString(and(a,b)));
		System.out.println("01 OR 10 is " + Integer.toBinaryString(or(a,b)));
		System.out.println("01 EXOR 10 is " + Integer.toBinaryString(exor(a,b)));
		System.out.println("10 EXOR 10 is " + Integer.toBinaryString(exor(c,b)));
		System.out.println("01 compliment is " + Integer.toBinaryString(comp(a)));
		System.out.println("01 shift left by 10 is " + Integer.toBinaryString(shiftl(a,b)));
		System.out.println("01 shift right by 10 is " + Integer.toBinaryString(shiftr(a,b)));
		System.out.println("01 shift right zero fill by 10 is " + Integer.toBinaryString(shiftz(a,b)));
		
	}
	
	// ANDs each member of the binary representation
	public static int and(int m, int n) {
		return m & n;
	}
	
	// ORs each member of the binary representation
	public static int or(int m, int n) {
		return m | n;
	}
	
	// EXORs each member of the binary representation
	public static int exor(int m, int n) {
		return m ^ n;
	}
	
	// Gives the complement of a binary
	public static int comp(int m) {
		return ~m;
	}
	
	// Shifts the binary representation by the second binary specified
	public static int shiftl(int m, int n) {
		return m << n;
	}
	public static int shiftr(int m, int n) {
		return m >> n;
	}
	public static int shiftz(int m, int n) {
		return m >>> n;
	}

}
