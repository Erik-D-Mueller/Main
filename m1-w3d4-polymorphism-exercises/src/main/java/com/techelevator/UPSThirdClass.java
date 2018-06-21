package com.techelevator;

public class UPSThirdClass implements DeliveryDriver {

	@Override
	public Double calculateRate(int packageWeight, double packageDistance) {
	
		return (packageWeight/16.0) * packageDistance * 0.0050; 
	
	}

	@Override
	public String nameOfQuote() {
		
		return "UPS (4-Day Ground)            ";
	}

}