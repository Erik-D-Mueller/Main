package com.techelevator;

public class Car implements Vehicle {

	
	private boolean hasTrailer;   // True for has trailer, false for does not.
		
	public Car(boolean hasTrailer){   // This is the constructor method, I require that they send values
		
		this.hasTrailer = hasTrailer;   // This sets the values
		
	}
			
		
	@Override
	public double calculateToll(int distanceTravelled) {
			
			
	if(hasTrailer) { return (1 + distanceTravelled*00.020); }  //If the car has a trailer then the toll is $1 more expensive 
			
		return distanceTravelled * 0.020;
	
	}
	

	@Override
	public boolean getHasTrailer() {
		
		return hasTrailer;
	}

	@Override
	public int getNumberOfAxles() {
		
		return 0;
	}

	@Override
	public String getTypeOfVehicle() {
		
		return "Car";
	}
	
	
}
