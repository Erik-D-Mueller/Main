package com.techelevator.product;

public class Product {

	private String name;
	private double price;
	private double weightInOunces;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setPrice(double price) {
		
		this.price = price;
		
	}
	
	public double getPrice() {
		
		return this.price;
		
	}
	
public void setWeightInOunces(double weightInOunces) {
	
	this.weightInOunces = weightInOunces;
	
}

public double getWeightInOunces() {
	
	return this.weightInOunces;

}
	
	
}