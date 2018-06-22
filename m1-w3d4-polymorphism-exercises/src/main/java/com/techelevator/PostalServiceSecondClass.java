package com.techelevator;

public class PostalServiceSecondClass extends ShippingQuotes implements DeliveryDriver {

	@Override
	public Double calculateRate(int packageWeight, double packageDistance) {
		return packageDistance * getRatePerMile(packageWeight);
	}

	
	@Override
	public String nameOfQuote() {
		
				return "Postal Service (2nd Class)    ";
						
	}


	private double getRatePerMile(int packageWeight){
		
		if(packageWeight<=2)  {return 0.035/10.0;}
		if(packageWeight<=8 ) {return 0.040/10.0;}
		if(packageWeight<=15) {return 0.047/10.0;}
		if(packageWeight<=48) {return 0.195/10.0;}
		if(packageWeight<=128) {return 0.450/10.0;}
		
		return 0.5/10.0;  // It only gets here if the weight is above 72 ounces
	}






}
