package com.techelevator;


// Weight is always in ounces, there are 16 ounces in a pound

public class PostalService implements DeliveryDriver {

	double packageWeight;
	double packageDistance;
	int classLevel;
	String nameOfQuote;
	double ratePerMile;
	
	public PostalService(double packageWeight, double packageDistance, int classLevel) {
		
		this.packageWeight = packageWeight;
		this.packageDistance = packageDistance;
		this.classLevel = classLevel;
		
	}
	
	private double getRatePerMile() {
		
		double divNumber = 1.0;   // This changes to 10 if the classLevel==2;
	
		if(classLevel==3) {
			if(packageWeight<=2)  {return 0.0020; }
			if(packageWeight<=8 ) {return 0.0022; }
			if(packageWeight<=15) {return 0.0024; }
			if(packageWeight<=19) {return 0.0150; }
			if(packageWeight<=72) {return 0.0160; }
			return 0.0170;   // It only gets here if the weight is above 72 ounces
		
		}
		
		// It can only get down here if the classLevel is 1 or 2
		
		if(classLevel == 2) { divNumber = 10.0;}

		
		/* The first and second class rates are the same except for a multiple of 10, 
		*  so I only enter the numbers once, and I divide by either 1 or 10 depending if it is first class or 2nd class
		*/ 
	
		if(packageWeight<=2)  {return (0.035/divNumber)   ; }
		if(packageWeight<=8 ) {return (0.040/divNumber)   ; }
		if(packageWeight<=15) {return (0.047/divNumber)   ; }
		if(packageWeight<=19) {return (0.195/divNumber)   ; }
		if(packageWeight<=72) {return (0.450/divNumber)   ; }
		
		return (0.5/divNumber);  // It only gets here if the weight is above 72 ounces
		
		
	}
	


	@Override
	public Double calculateRate() {
	
		return getRatePerMile()*packageDistance;   // The ratePerMile depends the weight, so the weight is already accounted for in the rate per mile
		
	}

	@Override
	public String nameOfQuote() {
		
		if(classLevel==1) { return "Postal Service (1st Class)     ";}
		if(classLevel==2) { return "Postal Service (2nd Class)     ";}
		if(classLevel==3) { return "Postal Service (3rd Class)     ";}
		
		return "error";
	}
	
	
}
