package privacy_demo;

public class Demo1 {
	
	private static void helloPrivate() {
		System.out.println("Private method of Demo1");
	}
	
	protected static void helloProtected() {
		System.out.println("Protected method of Demo1");
	}
	
	public static void helloPublic() {
		System.out.println("Public method of Demo1");
	}
	
	static void helloDefault() {
		System.out.println("Default method of Demo1");
	}

}
