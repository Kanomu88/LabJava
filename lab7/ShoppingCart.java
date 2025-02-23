//Name: Chananchida Chongkhum
//ID : 6787016
//Section : 1

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Product> products;
	private int customerAge;
	private double buystimer;
	private boolean isMember;
	public ShoppingCart(int customerAge,double buystimer,Boolean isMember) {
		this.products = new ArrayList<Product>();
		this.customerAge = customerAge;
		this.buystimer = buystimer;
		this.isMember = isMember;
		System.out.println("Shopping Cart is created ... ");
	}
	
	public void setCustomerAge(int age) {
		this.customerAge = age;
	}
	
	public int getCustomerAge() {
		return this.customerAge;
	}
	
	public void setTime(double buyTimer) {
		this.buystimer = buyTimer;
	}
	
	public double getTime() {
		return this.buystimer;
	}
	
	public void setMember(Boolean isMember) {
		this.isMember = isMember;
	}
	
	public Boolean getMember() {
		return this.isMember;
	}
	
	// TODO 5: add product
	public void addProduct(Product product) {
		if(product instanceof AgeRestrictedProduct) {
			AgeRestrictedProduct resultproduct = (AgeRestrictedProduct) product;
			if (!resultproduct.isEligible(customerAge)) {
		        System.out.println("You are not eligible to buy " + product.getName());
				return;
			}
		}
		//bonus
		if(product instanceof LimitProductTime) {
			LimitProductTime resultproduct = (LimitProductTime) product;
			if (!resultproduct.isEligible(buystimer)) {
				System.out.println("Timelimit to buys "+product.getName());
				return;
			}
		}
		
		if(product instanceof MemberRestrictedProduct) {
			MemberRestrictedProduct resultproduct = (MemberRestrictedProduct) product;
			if (!resultproduct.isEligible(isMember)) {
                System.out.println("You must be a member to buy " + product.getName());
				return;
			}
		}
			products.add(product);
			System.out.println(product.getName() + " is added to the cart.");
	}
	
	
	// TODO 6: calculate total price
	public double calculateTotalPrice() {
		double totalprice = 0.0 ;
		for (Product pd:products) {
			totalprice += pd.getPrice();
		}
		return totalprice;
	}

	public void clear() {
		products.clear();
		System.out.println("Shopping Cart is cleared ... ");
	}
	
	
	// DO NOT MODIFY MAIN
	public static void main(String[] args) {
		System.out.println("Creating Products");
		Product candy = new Product("Candy", 25.00);
		AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
		LimitProductTime Sangsom = new LimitProductTime("Sangsom", 650,22.3,23.5);
		MemberRestrictedProduct Vipcard = new MemberRestrictedProduct("Vipcard", 989);
		System.out.println("------------------------------------------\n");
		
		ShoppingCart cart = new ShoppingCart(20, 19.0,false);
		cart.addProduct(candy);
		cart.addProduct(wine);
		cart.addProduct(Sangsom);
		cart.addProduct(Vipcard);
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge()+ ")");
		System.out.println("\nChecking out (Time:" + cart.getTime() + ")\n");
		System.out.println("\nChecking out (Member:" + cart.getMember() + ")\n");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
		
		cart.clear();				// clear shopping cart (remove all products in the cart)
		cart.setCustomerAge(35);	// change the customer age to 35 years old
		cart.setTime(23.3);	// change the customer age to 35 years old
		cart.setMember(true);	// change the customer age to 35 years old
		cart.addProduct(candy);
		cart.addProduct(wine);
		cart.addProduct(Sangsom);
		cart.addProduct(Vipcard);

		System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
		System.out.println("\nChecking out (Time:" + cart.getTime() + ")\n");
		System.out.println("\nChecking out (Member:" + cart.getMember() + ")\n");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
	}

}