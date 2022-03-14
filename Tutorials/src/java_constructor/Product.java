package java_constructor;

public class Product {
	String name;
	float price;

	// This is Constructor
	Product(String name, float price) {
		this.name = name;
		this.price = price;

		System.out.println("The product name is: " + name);
		System.out.println("The price is: " + price);
	}
}
