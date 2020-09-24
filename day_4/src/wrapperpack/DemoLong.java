package wrapperpack;

public class DemoLong {

	public static void main(String[] args) {
		
		Long l1 = 46603l;
		Long l2 = new Long(46603);
		
		System.out.println("Long Comparisons: ");
		System.out.println("l1==l2: " + (l1==l2));
		System.out.println("l1.equals(l3): " + (l1.equals(l2)));
		
		System.out.println("\nLong MAX_VALUE: " + Long.MAX_VALUE);
		System.out.println(("Long MIN_VALUE: " + Long.MIN_VALUE));
		
		System.out.println("\nAutoboxing: ");
		Long l3 = 3982035857l;
		long x = l3;
		System.out.println("x: " + x);
		x = 1923834756;
		l3 = x;
		System.out.println("l3: " + l3);
		
		System.out.println("\nString conversion: ");
		String s = "33329487";
		long ls = Long.parseLong(s);
		System.out.println("ls :" + ls);
		
		ls = -55543;
		s = ls+"";
		System.out.println("s: " + s);
		
		System.out.println("\nWrapper values:");
		Long l4 = -9223372036854775807l;
		Integer i = l4.intValue();
		Float f = l4.floatValue();
		Double d = l4.doubleValue();
		System.out.println("Long: " + l4 + "\nInteger: " + i+ "\nFloat: " + f + "\nDouble: " + d);

	}

}
