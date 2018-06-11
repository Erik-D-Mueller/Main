package com.techelevator;

public class FedEx implements DeliveryDriver {

	double packageWeight;
	double packageDistance;
	double rate;
	
	public FedEx(double packageWeight, double packageDistance) {   // This constructor requires that we send the info package weight and packaae distance.
		
		rate = 20.0;
		this.packageWeight = packageWeight;
		this.packageDistance = packageDistance;
		
		
	}
	
	
	@Override
	public Double calculateRate() {
		
	//rate starts out at $20 the baseamount for fed-ex
		
	if (packageDistance > 500 ) {  rate += 5;  }   // If it is traveling more than 500 miles, add $5
	
	if(packageWeight > 48) {  rate += 3;  }    //If it weighs more than 48 ounces, add $3
	
	return rate;
	
	}


	@Override
	public String nameOfQuote() {
		
		return "FedEx			";

	}

}
