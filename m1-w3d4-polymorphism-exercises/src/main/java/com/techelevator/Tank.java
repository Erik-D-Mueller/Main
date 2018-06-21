package com.techelevator;

public class Tank implements Vehicle {    //No constructor needed, no values are passed

	private double distanceTravelled;
	
	public Tank() {
		
		
	}
	
	@Override
	public double calculateToll(double distanceTravelled) {          //Tanks travel for free, so we always return zero
	 
		return 0;
	}

	@Override
	public double getDistanceTravelled() {   //We still document the distance travelled even though they travel for free
		
		return distanceTravelled;
	}

	@Override
	public boolean getHasTrailer() {
		 
		return false;
	}

	@Override
	public int getNumberOfAxles() {
		
		return 0;
	}

	@Override
	public String getTypeOfVehicle() {
		
		return "Tank";
	}
	
	
}
