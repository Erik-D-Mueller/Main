package com.techelevator;

public class UPS implements DeliveryDriver {

	
	double packageWeight;
	double packageDistance;
	double rate;
	int classLevel;
	
	public UPS(double packageWeight, double packageDistance, int classLevel) {   // This constructor requires that we send the info package weight and packaae distance.
		
		rate = 20.0;     // $20 is the baserate, then more money gets added if thresholds are hit
		this.packageWeight = packageWeight;
		this.packageDistance = packageDistance;
		this.classLevel = classLevel;
		
	}
	
	
	@Override
	public Double calculateRate() {
	
		if(classLevel==1)  { return (packageWeight/16) * packageDistance * 0.075;    }   //   ounces back to pounds
		if(classLevel==2)  {  return (packageWeight/16) * packageDistance * 0.050;   }
		if(classLevel==3)  {  return (packageWeight/16) * packageDistance * 0.0050;  }
		
		return 100000000000000.0;    // This is here to make eclipse happy, even though it should never be able to get here.  
	}

	
public String nameOfQuote() {
		
		if(classLevel==1) { return "UPS (next-day)    	";}
		if(classLevel==2) { return "UPS (2-day business)     ";}
		if(classLevel==3) { return "UPS (4-day ground)	   ";}
		
		return "error";
	}
	
}