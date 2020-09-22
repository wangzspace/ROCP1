package logical_operators_demo;

public class Logical {

	public static void main(String[] args) {
		
		boolean yes = true;
		boolean no = false;
		boolean maybe = true;
		
		System.out.println("If " + yes + " and " + maybe + " then " + and(yes, maybe));
		System.out.println("If " + yes + " and " + no + " then " + and(yes, no));
		System.out.println("If " + no + " or " + maybe + " then " + or(no, maybe));
		
	}
	
	//ANDS the condition of two types
	public static boolean and(boolean a, boolean b) {
		return a && b;
	}
	
	//ORs the condition or two types
	public static boolean or(boolean a, boolean b) {
		return a || b;
	}

}
