package model;

public class Store {
	private SKU[] skuMatrix; // Create a SKUarray with 3 SKUs.
	private int orderSize;
	private int balance = 10000;	// initial balance (cash) of store is 10K

	public Store(int noSKUs)
	{
		skuMatrix = new SKU[noSKUs];
	}

	public void reorder(){
		for(int i = 0; i < skuMatrix.length; i++){
			if(skuMatrix[i].stockLvl < skuMatrix[i].minStockLvl ){
				orderSize = skuMatrix[i].maxStockLvl - skuMatrix[i].stockLvl ; // calculate how many pieces will be ordered
				balance = balance - orderSize * skuMatrix[i].buyPrice; // Pay the supplier
				skuMatrix[i].stockLvl = skuMatrix[i].maxStockLvl; // When ROP is reached, stock will be reset to maxStockLvl.
				System.out.println(skuMatrix[i].skuName + " has been reordered");
			}
		}
	}
	
	public void setSkuMatrix(SKU[] skuMatrix2){
		skuMatrix = skuMatrix2;
	}
	public void decreaseStock(int i){
		skuMatrix[i].stockLvl = skuMatrix[i].stockLvl -1;
	}
}
