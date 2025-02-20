
/**
 * DO NOT MODIFY
 *
 */

public class Product {
	private String name;
	private double price;
	private int age;
	public Product(String name, double price,int age) {
		this.age = age;
		this.name = name;
		this.price = price;
		System.out.println("Product is created ...");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Name: " + name + ", price: " + price;
	}

}