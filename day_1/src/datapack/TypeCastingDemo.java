package datapack;

public class TypeCastingDemo {
	public static void main (String args[]) {
		
		/*
		 * TypeCasting
		 * Conversion of one data type to another
		 * 
		 * 1) Implicit Casting: done by compiler when assigning smaller data types to larger data types
		 * 2) Explicit Casting: done by programmer when converting larger types to smaller types
		 */
		
		System.out.println("Implicit Casts:");
		
		int x = 1000;    //4 bytes
		float f1 = x;    //4 bytes
		double d1 = x;   //8 bytes
		
		System.out.println("x: " + x);
		System.out.println("f: " + f1);
		System.out.println("d: " + d1);
		
		char c = 'A';    //2 bytes
		int y = c;       //4 bytes
		
		System.out.println("Value of 'A': " + y);
		
		System.out.println("\nExplicit Casts:");
		
		y = 100;
		c = (char)y;
		
		System.out.println("Char at 100: " + c);
		
		float f = 99.88f;
		int z = (int)f;
		System.out.println("z: " + z);
	}
}
