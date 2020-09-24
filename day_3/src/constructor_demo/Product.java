package constructor_demo;

public class Product {
	
	int i = 0;
	String n = "";
	int r = 0;
	double c = 0.00;
	
	public Product() {
		
	}
	
	public Product(int id, String name, int rating, double cost) {
		this.i = id;
		this.n = name;
		this.r = rating;
		this.c = cost;
	}
	
	// Print product info
	@Override
	public String toString() {
		return i + ": " + n + " | " + r + " | $" + c;
	}
}
