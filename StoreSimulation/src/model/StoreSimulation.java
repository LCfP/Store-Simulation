package model;

import java.util.Random;

public class StoreSimulation {

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
