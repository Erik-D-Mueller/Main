package com.techelevator;

public class UPSSecondClass implements DeliveryDriver {

	@Override
	
	public Double calculateRate(int packageWeight, double packageDistance) {
	
		return (packageWeight/16.0) * packageDistance * 0.050;
	
	}

	@Override
	
	public String nameOfQuote() {
	
		return "UPS (2-Day)  Business         ";
	
	}

}
