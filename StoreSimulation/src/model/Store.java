package model;

public class Store {
	private SKU[] skuMatrix; // Create a SKUarray with 3 SKUs.

	public Store(int noSKUs)
	{
		skuMatrix = new SKU[noSKUs];
	}

	public void reorder(){
		for(int i = 0; i < skuMatrix.length; i++){
			if(skuMatrix[i].stockLvl < skuMatrix[i].minStockLvl ){
				skuMatrix[i].stockLvl = skuMatrix[i].maxStockLvl; // When ROP is reached, stock will be reset to maxStockLvl.
			}
		}
	}
	public void setSkuMatrix(SKU[] skuMatrix2)
	{
		skuMatrix = skuMatrix2;

	}
}
