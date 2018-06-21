package com.techelevator;

public class PostalServiceThirdClass implements DeliveryDriver {

	@Override
	public Double calculateRate(int packageWeight, double packageDistance) {
		return packageDistance*getRatePerMile(packageWeight);
	}

	@Override
	public String nameOfQuote() {
		
				return "Postal Service (3rd Class)    ";
						
	}

	
	
private double getRatePerMile(int packageWeight){
		
	if(packageWeight<=2)  {return 0.0020; }
	if(packageWeight<=8 ) {return 0.0022; }
	if(packageWeight<=15) {return 0.0024; }
	if(packageWeight<=48) {return 0.0150; }
	if(packageWeight<=128) {return 0.0160; }
	return 0.0170;   // It only gets here if the weight is above 72 ounces	
	
	
	}
	
	
	
}
