package com.techelevator;

public class Elevator {

int currentFloor = 1;
int numberOfFloors;
boolean doorOpen;

public Elevator(int totalNumberOfFloors) {
	
	this.numberOfFloors = totalNumberOfFloors;	
	
}


public int getCurrentFloor() {
	
	return this.currentFloor;
		
}


public int getNumberOfFloors() {
	
	return this.numberOfFloors;
	
}



public boolean isDoorOpen() {
	
	return this.doorOpen;
	
}

public void openDoor() {
	
	doorOpen = true;
	
}

public void closeDoor() {
	
	doorOpen = false;
}


public void goUp() {	
	
	if(!doorOpen && currentFloor < numberOfFloors) {  this.currentFloor++; }
				
	}
	

public void goDown() {
	
	if(!doorOpen && currentFloor > 1) { this.currentFloor--; }
	
}


}