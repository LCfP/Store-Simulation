package model;

public class StoreSimulation {

	public static void main(String[] args)
	{
		Store newStore = new Store(3);
		SKU[] skuMatrix = new SKU[3];

		SKU sku = new SKU();
		sku.setSKU(1, "Bread", 1.5, 10, 5, 15);
		skuMatrix[1] = sku;
		sku.setSKU(1, "Butter", 2.5, 20, 7, 20);
		skuMatrix[2] = sku;
		sku.setSKU(1, "Milk", 1.0, 20, 10, 30);
		skuMatrix[3] = sku;

		newStore.setSkuMatrix(skuMatrix);

	}

}
