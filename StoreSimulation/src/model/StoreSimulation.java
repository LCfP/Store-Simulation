package model;

import java.util.ArrayList;
import java.util.Random;

import org.omg.CORBA.ShortSeqHelper;

public class StoreSimulation {

	public static final int nrProductTypes = 1;
	public static final int maxNoCustomers = 10;
	public static final int maxDemand = 5;
	
	public static final int initialInventory = 100;
	public static final int minInventory = 70;
	public static final int maxInventory = 100;
	public static int currentInventory = 0;
	public static int productsSoldPerDay = 0;
	
	//Product info
	public static final String productName = "Milk";
	public static final double productPrice = 1;
	public static final int daysUntilObsolete = 3;
	
	public static final double satisfactionChange = 0.05;
	
	
	public static int IDcounter = 0;
	
	public static Store store;
	
	public static void initialize()
	{
		store = new Store();
		Product product;
		
		for(int idx=0;idx<initialInventory;idx++)
		{
			product = new Product(IDcounter, productName, productPrice, daysUntilObsolete,0);
			IDcounter++;
			
			store.AddProductToShelve(product);
			currentInventory++; // counter which counts how many products are there
		}
	}
	
	public static void simulate(int noOfDays,Random r)
	{
		for(int idx=0;idx<noOfDays;idx++)		// for every day
		{
			ArrayList<Integer> indexNos = new ArrayList<Integer>(0);
			//check obsoleteness
			for(Product p:store.getShelves())//smart loop
			{
				if(p.isObsolete(idx))
					indexNos.add(store.getShelves().indexOf(p));
			}
			
			for(int idx2=(indexNos.size()-1);idx2>=0;idx2--)
			{
				store.getShelves().remove(indexNos.get(idx2));
				currentInventory = currentInventory - indexNos.size();  // update currentInventory
				
			}
			System.out.printf("\nDay %d:\n", idx);
			System.out.printf("No. of obsolete products thrown away: %d\n", indexNos.size());
			//make and serve customers
			int noOfNewCustomers = r.nextInt((int) (store.getSatisfaction()*maxNoCustomers) );
			Customer c;
			System.out.printf("No. of customers %d:\n", noOfNewCustomers);
			for(int idx2=0;idx2<noOfNewCustomers;idx2++)
			{
				c = new Customer();
				c.setRandomDemand(r);
				
				store.serveCustomer(c);
				productsSoldPerDay = productsSoldPerDay + c.getRandomDemand(); // update products per day counter
				currentInventory = currentInventory - productsSoldPerDay;
				
			}
			System.out.printf("Inventory left before reorder: %d:\n " , store.getShelveSize());
			// reorder
			store.determineReorderSize();
			Product product;
			for(int idx3=0;idx3 < store.reorderSize;idx3++)
			{
				product = new Product(IDcounter, productName, productPrice, daysUntilObsolete,0);
				IDcounter++;
				
				store.AddProductToShelve(product);
			}
			System.out.printf("No. of products reordered: %d\n", store.getReorderSize());
			System.out.printf("No. of products sold this day: %d\n", productsSoldPerDay);
			productsSoldPerDay = 0; // reset products sold per day after every day.
		}
	}

	public static void main(String[] args)
	{
		initialize();
		Random r = new Random();
		r.setSeed(2);
		simulate(5,r);
		
	}

}
