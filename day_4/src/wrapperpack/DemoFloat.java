package wrapperpack;

public class DemoFloat {

	public static void main(String[] args) {

		Float f1 = 1.3f;
		Float f2 = new Float(1.3);
		Float f3 = 54.123f;
		
		System.out.println("Float Comparisons: ");
		System.out.println("f1==f2: " + (f1==f2));
		System.out.println("f1.equals(f3): " + (f1.equals(f2)));
		
		System.out.println("\nFloat MAX_VALUE: " + Float.MAX_VALUE);
		System.out.println(("Float MIN_VALUE: " + Float.MIN_VALUE));
		
		System.out.println("\nAutoboxing: ");
		float x = f3;
		System.out.println("x: " + x);
		x = 23.333f;
		f3 = x;
		System.out.println("f3: " + f3);
		
		System.out.println("\nString conversion: ");
		String s = "43.12";
		float fs = Float.parseFloat(s);
		System.out.println("fs :" + fs);
		
		fs = 60f;
		s = fs+"";
		System.out.println("s: " + s);
		
		System.out.println("\nWrapper values:");
		Float f4 = 30.72f;
		Integer i = f4.intValue();
		Double d = f4.doubleValue();
		Long l = f4.longValue();
		System.out.println("Float: " + f4 + "\nInteger: " + i+ "\nDouble: " + d + "\nLong: " + l);
		
	}

}
