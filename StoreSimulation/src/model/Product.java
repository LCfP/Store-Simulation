package model;

public class Product {
	private String ProductName;
	private double ProductPrice;
	private int DaysUntilProductIsObsolete;
	private int ProductEssentialness;
	
	public Milk() {
		this.ProductName = "Milk";
		this.ProductPrice = 0.50;
		this.DaysUntilProductIsObsolete = 3;
		this.ProductEssentialness = 1;
	}
	
	public Bread() {
		this.ProductName = "Bread";
		this.ProductPrice = 1.50;
		this.DaysUntilProductIsObsolete = 5;
		this.ProductEssentialness = 1;
	}
	
	public Butter() {
		this.ProductName = "Butter";
		this.ProductPrice = 1.00;
		this.DaysUntilProductIsObsolete = 20;
		this.ProductEssentialness = 2;
	}
	
	public Cheese() {
		this.ProductName = "Cheese";
		this.ProductPrice = 3.00;
		this.DaysUntilProductIsObsolete = 10;
		this.ProductEssentialness = 2;
	}
	
	public Meat() {
		this.ProductName = "Meat";
		this.ProductPrice = 4.00;
		this.DaysUntilProductIsObsolete = 1;
		this.ProductEssentialness = 2;
	}
	
	public Appels() {
		this.ProductName = "Appels";
		this.ProductPrice = 1.20;
		this.DaysUntilProductIsObsolete = 3;
		this.ProductEssentialness = 3;
	}
	
	public Bananas() {
		this.ProductName = "Bananas";
		this.ProductPrice = 1.40;
		this.DaysUntilProductIsObsolete = 3;
		this.ProductEssentialness = 3;
	}
	
	public Tomatoes() {
		this.ProductName = "Tomatoes";
		this.ProductPrice = 2.60;
		this.DaysUntilProductIsObsolete = 2;
		this.ProductEssentialness = 3;
	}
	
	public Potatoes() {
		this.ProductName = "Potatoes";
		this.ProductPrice = 1.90;
		this.DaysUntilProductIsObsolete = 5;
		this.ProductEssentialness = 3;
	}
	
	public void printProductDetails(){
		System.out.println("Product: " + this.ProductName);
		System.out.println("Price: " + this.ProductPrice);
		System.out.println("Obsolete date: " + this.DaysuntilProductIsObsolete);
		System.out.println("Product essentialness: " + this.ProductEssentialness);
	}
}
