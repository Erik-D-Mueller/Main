package com.techelevator;

public class Elevator {

int currentFloor = 1;
int numberOfFloors;
boolean doorOpen;

public Elevator(int totalNumberOffloors) {
	
	this.numberOfFloors = totalNumberOffloors;	
	
}


public int getCurrentFloor() {
	
	return this.currentFloor;
		
}


public int getNumberOfFloors() {
	
	return this.numberOfFloors;
	
}



public boolean getDoorOpen() {
	
	return this.doorOpen;
	
}


public void goUp() {	
	
	if(!doorOpen && currentFloor < numberOfFloors) {  this.currentFloor--; }
				
	}
	



public void goDown() {
	
	if(!doorOpen && currentFloor > 1) { this.currentFloor ++; }
	
}


}
