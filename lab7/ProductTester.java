/**
 * 
 * FOR TESTING ONLY, DO NOT MODIFY
 * 
 * ****** EXPECTED OUTPUT ******
 * 
 * Product is created ...
 * Product Information
 * Name: Candy, price: 25.0
 * == Update product info ==
 * Name: Big Candy, price: 20.99
 * ------------------------------------------------
 * Product is created ...
 * Age-restricted product is created ...
 * Age-Restricted Product Information
 * Name: Wine, price: 999.0, Minimum Age: 21
 * Age 20 is NOT eligible
 * Age 35 is eligible
 * == Update product info ==
 * Name: Red Wine, price: 1010.0, Minimum Age: 21
 * 
 * *****************************
 */

public class ProductTester {

	public static void main(String[] args) {
		
		Product candy = new Product("Candy", 25.00);
		System.out.println("Product Information");
		System.out.println(candy.toString());
		
		System.out.println("== Update product info ==");
		candy.setName("Big Candy");
		candy.setPrice(20.99);
		System.out.println(candy.toString());
		System.out.println("------------------------------------------------");
		
		
		AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
		System.out.println("Age-Restricted Product Information");
		System.out.println(wine.toString());
		checkAge(wine, 20);
		checkAge(wine, 35);
		
		System.out.println("== Update product info ==");
		wine.setName("Red Wine");
		wine.setPrice(1010);
		System.out.println(wine.toString());
		
	}
	
	public static void checkAge(AgeRestrictedProduct product, int age) {
		if(product.isEligible(age)) {
			System.out.println("Age " + age + " is eligible");
		} else {
			System.out.println("Age " + age + " is NOT eligible");
		}
	}

}