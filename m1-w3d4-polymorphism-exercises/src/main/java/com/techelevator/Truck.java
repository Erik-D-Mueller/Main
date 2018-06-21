package com.techelevator;

public class Truck implements Vehicle {

	int numberOfAxles;
	double rate; // The rate per mile is set later, based upon number of axles
	double distanceTravelled;
	
public Truck(int numberOfAxles) {
	
	this.numberOfAxles = numberOfAxles;
	
}
	
	@Override
	public double calculateToll(double distanceTravelled) {
		
		if(numberOfAxles==4) {rate=0.040;}    // This sets the rate based upon how many axles the truck has
		if(numberOfAxles==6) {rate=0.045;}
		if(numberOfAxles>=8) {rate=0.048;}
		
		return rate*distanceTravelled;
	}

	@Override
	public double getDistanceTravelled() {
		
		return distanceTravelled;
	}

	@Override
	public boolean getHasTrailer() {
		
		return false;
	}

	@Override
	public int getNumberOfAxles() {
		
		return numberOfAxles;
	}

	@Override
	public String getTypeOfVehicle() {
		
		return "Truck";
	}
	
	
}
