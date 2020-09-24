package constructor_demo;

public class ProductMain {

	public static void main(String[] args) {
		
		// Created new product with default parameters
		Product p1 = new Product();
		System.out.println(p1);
		
		// Accessed because variables declared public, should be private and parameters can be set with setter methods
		p1.c = 3.59;
		p1.i = 1;
		p1.n = "Product1";
		p1.r = 3;
		// Set values of product variables
		System.out.println(p1);
		
		// Create new product with parameters
		Product p2 = new Product(2, "Product2" , 5, 4.99);
		System.out.println(p2);

	}

}
