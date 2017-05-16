package model;

public class SKU {
	int skuID;
	String skuName = null;
	double skuPrice;
	int stockLvl;
	int minStockLvl;
	int maxStockLvl;
	int buyPrice;
	
	public SKU(int skuID, String skuName, double skuPrice, int stockLvl, int minStockLvl, int maxStockLvl, int buyPrice, int sellPrice){
		this.skuID = skuID;
		this.skuName = skuName;
		this.skuPrice = skuPrice;
		this.stockLvl = stockLvl;
		this.minStockLvl = minStockLvl;
		this.maxStockLvl = maxStockLvl;
		this.buyPrice = buyPrice;
		
	}

	public void setSKU(int skuID, String skuName, double skuPrice, int stockLvl, int minStockLvl, int maxStockLvl, int buyPrice, int sellPrice){
		this.skuID = skuID;
		this.skuName = skuName;
		this.skuPrice = skuPrice;
		this.stockLvl = stockLvl;
		this.minStockLvl = minStockLvl;
		this.maxStockLvl = maxStockLvl;
		this.buyPrice = buyPrice;
		
	}
}