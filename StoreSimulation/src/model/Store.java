package model;

import java.util.ArrayList;

public class Store {
	// shelves
	private ArrayList<Product> shelves; // shelve has 4 columns (products) and 10 spots (10 pcs. of every poduct).
	private double satisfaction;
	int reorderSize = 0;
	
	public Store()
	{
		this.shelves = new ArrayList<Product>(0);
		this.satisfaction = 1;
	}
	
	// add product
	public void AddProductToShelve(Product product){
		shelves.add(product);
		
	}
	// remove product
	public void RemoveProduct(Product product){
		shelves.remove(product);
	}
	
	public void serveCustomer(Customer customer)
	{
		if(customer.getDemand() <= shelves.size())
		{
			for(int idx=0;idx<customer.getDemand();idx++)
				shelves.remove(0);
			
			this.satisfaction = Math.min(1,this.satisfaction+StoreSimulation.satisfactionChange);
		}
		else
		{
			this.satisfaction = Math.max(0,this.satisfaction-StoreSimulation.satisfactionChange);
			
		}
			
	}
	
	public void determineReorderSize(){
		if(shelves.size() < StoreSimulation.minInventory){
			
			this.reorderSize = StoreSimulation.maxInventory - shelves.size();
			
		}else{
			this.reorderSize = 0;
		}
	}
	public int getReorderSize(){
		return reorderSize;
	}
	
	public ArrayList<Product> getShelves(){
		return shelves;
	}

	public double getSatisfaction() {
		return satisfaction;
	}
	public int getShelveSize(){
		return shelves.size();
	}
}
