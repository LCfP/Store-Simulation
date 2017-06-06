package model;

public class Product {
	private int productID;
	private String productName;
	private int daysUntilProductIsObsolete;
	private double productPrice;
	private int arrivalDay;
	
	public Product(int id, String productName, double productPrice, int daysUntilProductIsObsolete, int arrivalDay) {
		this.productID = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.daysUntilProductIsObsolete = daysUntilProductIsObsolete;
		this.arrivalDay = arrivalDay;
	}
	
	 public boolean isObsolete(int day){

         if (day > (this.arrivalDay + this.daysUntilProductIsObsolete) )
         {
              return true;
         }
         else{
                return false;

                }
	 }
	
	int getproductID(){
		return productID;
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
	
	int getarrivalDay(){
		return arrivalDay;
	}
	
}
