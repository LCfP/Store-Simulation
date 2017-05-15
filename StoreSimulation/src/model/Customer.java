package model;

public class Customer {
	
	private boolean demand;			// True or False
	private int satisfaction;		// 1 - 5

	public Customer () {
		this.demand = true;
		this.satisfaction = 5;
		
	}

	public void printCustomerDetails(){
		System.out.println("Customer demand is" + this.demand);
		System.out.println("Customer satisfaction is" + this.satisfaction);
		
	}
}