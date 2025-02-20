/**
 * 
 * Modify this class to inherit from Product class
 *
 */

public class ProductTimelimit extends Product {
	private double Minlimittime;
	private double Maxlimittime;
	public ProductTimelimit(String name, double price,double Minlimittime,double Maxlimittime) {
		 super(name, price);
	        this.Minlimittime = Minlimittime;
	        this.Maxlimittime = Maxlimittime;
		System.out.println("Time-restricted product is created ...");
	}
	/*
	public void settimerlimit(double timelimit) {
		this.timelimitproduct = timelimit;
	}
	
	public double gettimerlimit() {
		return this.timelimitproduct;
	}
	 */

	public boolean isEligible(double timelimit) {
		return timelimit >= Minlimittime && timelimit <= Maxlimittime;
	}
}