package model;

import java.util.Random;

public class Customer {
	
	private int demand;			// True or False

	public Customer () {
		this.demand = 0;
		
	}
	
	public void setDemand(int productDemand)
	{
		demand = productDemand;
	}
	
	public void setRandomDemand(Random r)
	{
		demand = r.nextInt(StoreSimulation.maxDemand);
	}
	
	public int getDemand(){
		return demand;
	}

	public void printCustomerDetails(){
		System.out.println("Customer demand is" + this.demand);
		
	}

}