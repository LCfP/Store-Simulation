package model;

public class Product {
	private int productID;
	private boolean productGoesObsolete;
	private String productName;
	private int daysUntilProductIsObsolete;
	private double productPrice;
	private int productEssentialness;
	private int arrivalDay;
	
	public Product(int id, boolean productGoesObsolete, String productName, double productPrice, int daysUntilProductIsObsolete, int productEssentialness, int arrivalDay) {
		this.productID = id;
		this.productGoesObsolete = false;
		this.productName = productName;
		this.productPrice = productPrice;
		this.daysUntilProductIsObsolete = daysUntilProductIsObsolete;
		this.productEssentialness = productEssentialness;
		this.arrivalDay = arrivalDay;
	}
		
	public void setProduct(int id, boolean productGoesObsolete, String productName, double productPrice, int daysUntilProductIsObsolete, int productEssentialness, int arrivalDay) {
		this.productID = id;
		this.productGoesObsolete = false;
		this.productName = productName;
		this.productPrice = productPrice;
		this.daysUntilProductIsObsolete = daysUntilProductIsObsolete;
		this.productEssentialness = productEssentialness;
		this.arrivalDay = arrivalDay;
	}
	
	 public void productGoesObsolete(){

         if {

                this.Today > (this.arrivalDay + this.daysUntilProductIsObsolete)

                return true

                }

         else{

                return false

                }
	
	int getproductID(){
		return productID;
	}
	
	boolean getproductGoesObsoletes(){
		return productGoesObsolete;
	}
	
	String getproductName(){
		return productName;
	}
	
	int getdaysUntilProductIsObsolete(){
		return daysUntilProductIsObsolete;
	}
	
	double getproductPrice(){
		return productPrice;
	}
	
	int getproductEssentialness(){
		return productEssentialness;
	}
	
	int getarrivalDay(){
		return arrivalDay;
	}
	
}
