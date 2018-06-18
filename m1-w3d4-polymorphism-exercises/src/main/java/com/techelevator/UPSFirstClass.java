package com.techelevator;

public class UPSFirstClass  implements DeliveryDriver {

	@Override
	public Double calculateRate(int packageWeight, double packageDistance) {
	
		return ((packageWeight/16) * packageDistance * 0.075);
	
	}

	@Override
	public String nameOfQuote() {
		
		return "UPS (next-day)                ";
	}

}
