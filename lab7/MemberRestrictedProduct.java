public class MemberRestrictedProduct extends Product {
	// TODO 1: constructor
	public MemberRestrictedProduct(String name, double price) {	
		super(name, price);
		System.out.println("Member product is created ...");
	}
	
	// TODO 3: check eligibility 
	public boolean isEligible(boolean isMember) {
		return isMember;
	}
}

