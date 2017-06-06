package model;

import java.util.Random;

public class StoreSimulation {

	public static final int nrProductTypes = 1;
	public static final int maxNoCustomers = 10;
	public static final int maxDemand = 5;
	
	public static final int initialInventory = 100;
	
	//Product info
	public static final String productName = "Milk";
	public static final double productPrice = 1;
	public static final int daysUntilObsolete = 3;
	
	public static final double satisfactionChange = 0.05;
	
	
	public static int IDcounter = 0;
	
	public static Store store;
	
	public void initialize()
	{
		store = new Store();
		Product product;
		
		for(int idx=0;idx<initialInventory;idx++)
		{
			product = new Product(IDcounter, productName, productPrice, daysUntilObsolete,0);
			IDcounter++;
			
			store.AddProductToShelve(product);
		}
	}
	
	public void simulate(int noOfDays,Random r)
	{
		for(int idx=0;idx<noOfDays;idx++)
		{
			//check obsoleteness
			for(Product p:store.getShelves())//smart loop
			{
				if(p.isObsolete(idx))
					store.RemoveProduct(p);
			}
			
			//make and serve customers
			int noOfNewCustomers = r.nextInt((int) (store.getSatisfaction()*maxNoCustomers) );
			Customer c;
			
			for(int idx2=0;idx2<noOfNewCustomers;idx2++)
			{
				c = new Customer();
				c.setRandomDemand(r);
				
				store.serveCustomer(c);
			}
			
			//reorder
			
		}
	}

	public static void main(String[] args)
	{
		Product milk = new Product("Milk",0.50,3,1);
		Product bread = new Product("Bread",1.50,3,1);
		
		
		Store newStore = new Store(3);
		SKU[] skuMatrix = new SKU[3];
		Random rng = new Random();

		SKU brood = new SKU();
		brood.setSKU(1, "Bread", 1.5, 10, 5, 15, 1, 0);
		skuMatrix[0] = brood;
		SKU boter = new SKU();
		boter.setSKU(1, "Butter", 2.5, 20, 7, 20,2, 0);
		skuMatrix[1] = boter;
		SKU melk = new SKU();
		melk.setSKU(1, "Milk", 1.0, 20, 10, 30, 0 ,0);
		skuMatrix[2] = melk;

		newStore.setSkuMatrix(skuMatrix);
		System.out.println("Product database filled with" );
		System.out.println(skuMatrix[0].skuName);
		System.out.println(skuMatrix[1].skuName);
		System.out.println(skuMatrix[2].skuName);
		
		for(int i = 0; i<100; i++){
			int randomProduct = rng.nextInt(3);
			newStore.decreaseStock(randomProduct); // make demand function for simulation
			System.out.println("Customer buys " + skuMatrix[randomProduct].skuName);
			newStore.reorder();	// Check for reorders
		}
	}

}
