package com.techelevator;

public class Elevator {

int currentFloor = 1;
int numberOfFloors;
boolean doorOpen;

public Elevator(int totalNumberOfFloors) {
	
	this.numberOfFloors = totalNumberOfFloors;	
	
}

public void goUp(int desiredFloor) {	
	
	if(!doorOpen && currentFloor < desiredFloor && desiredFloor <= numberOfFloors) {  currentFloor=desiredFloor; }
				
	}

public void goDown(int desiredFloor) {
	
	if(!doorOpen && currentFloor > desiredFloor && desiredFloor>=1) { currentFloor=desiredFloor; }
	
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

}
