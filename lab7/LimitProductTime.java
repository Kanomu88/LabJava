

public class LimitProductTime extends Product {
	private double Minlimittime;
	private double Maxlimittime;
	// TODO 1: constructor
	public LimitProductTime(String name, double price,double MinTime,double MaxTime) {	
		super(name, price);
	    this.Minlimittime = MinTime;
	    this.Maxlimittime = MaxTime;
		System.out.println("Timelimit - product is created ...");
	}
	
	// TODO 3: check eligibility 
	public boolean isEligible(double buystimer) {
		return buystimer >= Minlimittime && buystimer <= Maxlimittime;
	}
}

