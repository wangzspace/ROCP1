package wrapperpack;

public class DemoDouble {

	public static void main(String[] args) {

		Double d1 = 2.44;
		Double d2 = new Double(2.44);
		
		System.out.println("Double Comparisons: ");
		System.out.println("d1==d2: " + (d1==d2));
		System.out.println("d1.equals(d3): " + (d1.equals(d2)));
		
		System.out.println("\nDouble MAX_VALUE: " + Double.MAX_VALUE);
		System.out.println(("Double MIN_VALUE: " + Double.MIN_VALUE));
		
		System.out.println("\nAutoboxing: ");
		Double d3 = 0.098;
		double x = d3;
		System.out.println("x: " + x);
		x = 1.234;
		d3 = x;
		System.out.println("d3: " + d3);
		
		System.out.println("\nString conversion: ");
		String s = "5.543";
		double ds = Double.parseDouble(s);
		System.out.println("ds :" + ds);
		
		ds = -9.6;
		s = ds+"";
		System.out.println("s: " + s);
		
		System.out.println("\nWrapper values:");
		Double d4 = -3.1359499382828009;
		Integer i = d4.intValue();
		Float f = d4.floatValue();
		Long l = d4.longValue();
		System.out.println("Double: " + d4 + "\nInteger: " + i+ "\nFloat: " + f + "\nLong: " + l);

	}

}
