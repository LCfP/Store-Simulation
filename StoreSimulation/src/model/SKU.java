package model;

public class SKU {
	int skuID;
	String skuName = null;
	double skuPrice;
	int stockLvl;
	int minStockLvl;
	int maxStockLvl;

	public void setSKU(int skuID, String skuName, double skuPrice, int stock, int minStockLvl, int maxStockLvl){
		this.skuID = skuID;
		this.skuName = skuName;
		this.skuPrice = skuPrice;
		this.stockLvl = stockLvl;
		this.minStockLvl = minStockLvl;
		this.maxStockLvl = maxStockLvl;
	}
}
