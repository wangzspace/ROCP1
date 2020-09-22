package datapack;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Data type - where you ask Java to allocated some memory for you to hold some values within
		 * 
		 * Java provides 8 primitive data types with default values
		 *      > Primitives hold the values in themselves instead of making a reference to memory
		 * 
		 * dataType          size          defaultValue
		 * --------------------------------------------------
		 * byte              1 byte        0
		 * short             2 bytes       0
		 * int               4 bytes       0
		 * long              8 bytes       0
		 * 
		 * float             4 bytes       0.0000f
		 * double            8 bytes       0,0000d (default for decimal values
		 * 
		 * char              2 bytes       '\u00000' (unicode charset) supports 17 languages
		 * boolean           1 bit         false
		 */
		
		int x = 100;
		System.out.println("Value of x = " + x);
		
		float f1 = 12.344f;
		System.out.println("Value of f1 = " + f1);
		
		double d1 = 889.99;
		System.out.println("Value of d1 = " + d1);
		
		String s = "Zeshan Wang";
		System.out.println("Hello " + s);
		
		char c = 'F';
		System.out.println("Pay respects: " + c);
		
		long l = 1234567890L;
		System.out.println("Value of l = " + l);
		
		boolean b = true;
		System.out.println("Value of b = " + b);

	}

}
