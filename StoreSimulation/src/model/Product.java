package model;

public class Product {
	private String ProductName;
	private double ProductPrice;
	private int DaysUntilProductIsObsolete;
	public static final int DAY_OF_WEEK_IN_MONTH[] DeliveryDate;
	private int[] ProductEssentialness;
	private String ObsoleteDate;

	public Product() {
		this.ProductName = "Milk";
		this.ProductPrice = double PriceList [];
		this.ObsoleteDate = this.DeliveryDate + this.DaysUntilProductIsObsolete;
		this.ProductEssentialness = this.ProductEssentialness[];
	}

	public void printProductDetails(){
		System.out.println("Product: " + this.ProductName);
		System.out.println("Price: " + this.ProductPrice);
		System.out.println("Obsolete date: " + this.ObsoleteDate);
		System.out.println("Product essentialness: " + this.ProductEssentialness);
	}
}
