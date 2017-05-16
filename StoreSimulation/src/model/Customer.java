package model;

public class Customer {
	
	private int[] demand;			// True or False
	private double satisfaction;		// 0-1

	public Customer (int noOfProducts) {
		this.demand = new int[noOfProducts];
		this.satisfaction = 1;
		
	}
	
	public void setDemand(int product, int productDemand)
	{
		demand[product] = productDemand;
	}

	public void printCustomerDetails(){
		System.out.println("Customer demand is" + this.demand);
		System.out.println("Customer satisfaction is" + this.satisfaction);
		
	}
}