
import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Product> products;
	private int customerAge;
	private double persontimerlimit;
	public ShoppingCart(int customerAge,double timelimit) {
		this.products = new ArrayList<Product>();
		this.customerAge = customerAge;
		this.persontimerlimit = timelimit;
		System.out.println("Shopping Cart is created ... ");
	}
	
	public void setCustomerAge(int age) {
		this.customerAge = age;
	}
	
	public int getCustomerAge() {
		return this.customerAge;
	}

	public void settimerlimit(double timelimit) {
		this.persontimerlimit = timelimit;
	}
	
	public double gettimerlimit() {
		return this.persontimerlimit;
	}
	
	// TODO 5: add product
	public void addProduct(Product product) {
		if(product instanceof AgeRestrictedProduct) {
			AgeRestrictedProduct resultproduct = (AgeRestrictedProduct) product;
			if (!resultproduct.isEligible(customerAge)) {
				System.out.println("You are not eligible to "+product.getName());
				return;
			}
		}
		if(product instanceof ProductTimelimit) {
			ProductTimelimit timeresutltproduct = (ProductTimelimit) product;
			if (!timeresutltproduct.isEligible(persontimerlimit)) {
				System.out.println("You are not eligible to "+product.getName());
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
		AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
		ProductTimelimit sangsom = new ProductTimelimit("sangsom", 650, 22.30,23.30);
		Product candy = new Product("Candy", 25.00);
		System.out.println("------------------------------------------\n");
		
		ShoppingCart cart = new ShoppingCart(20,19.00);
		cart.addProduct(candy);
		cart.addProduct(wine);
		cart.addProduct(sangsom);
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge()+ ")");
		System.out.println("\nChecking out (Time:" + cart.gettimerlimit()+ ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
		
		cart.clear();				// clear shopping cart (remove all products in the cart)
		cart.setCustomerAge(35);	// change the customer age to 35 years old
		cart.settimerlimit(23.00);	
		cart.addProduct(candy);
		cart.addProduct(wine);
		cart.addProduct(sangsom);
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
		System.out.println("\nChecking out (Time:" + cart.gettimerlimit() + ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
	}

}