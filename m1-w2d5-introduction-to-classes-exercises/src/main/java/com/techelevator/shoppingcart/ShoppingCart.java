package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	public ShoppingCart() {   //Constructors don't have a return type spot.
		
		this.totalNumberOfItems=0;
		this.totalAmountOwed=0.0;

		
	}
	
	public int getTotalNumberOfItems() {
		
		return this.totalNumberOfItems;
		
	}
	
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		
		this.totalNumberOfItems = totalNumberOfItems;
		
		
	}
	
	public double getTotalAmountOwed() {
		
		return this.totalAmountOwed;		
		
	}

	public void setTotalAmountOwed(double totalAmountOwed) {
		
		this.totalAmountOwed = totalAmountOwed;
		
	}
	
	public double getAveragePricePerItem() {
		
		
		if(this.totalNumberOfItems!=0) {   //We must check so that we don't divide by zero
		
		return this.totalAmountOwed / this.totalNumberOfItems;
		
		}
		
		return 0.0;
		
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		
		this.totalNumberOfItems+=numberOfItems;
		this.totalAmountOwed += ( pricePerItem * numberOfItems );
		
	}
	
public void empty() {
	
	this.totalNumberOfItems=0;
	this.totalAmountOwed=0.0;
	
}
	
}
