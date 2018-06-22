package com.techelevator;

public class PostalServiceFirstClass extends ShippingQuotes implements DeliveryDriver {

	

	@Override
	public Double calculateRate(int packageWeight, double packageDistance) {
		
		return packageDistance*getRatePerMile(packageWeight);
			
	}

	@Override
	public String nameOfQuote() {
		
				return "Postal Service (1st Class)    ";
						
	}

// This calculates the rate per mile, based on the weight
private double getRatePerMile(int packageWeight){
	
	if(packageWeight<=2)  {return 0.035;}
	if(packageWeight<=8 ) {return 0.040;}
	if(packageWeight<=15) {return 0.047;}
	if(packageWeight<=48) {return 0.195;}
	if(packageWeight<=128) {return 0.450;}
	
	return 0.5;  // It only gets here if the weight is above 72 ounces
}




}
