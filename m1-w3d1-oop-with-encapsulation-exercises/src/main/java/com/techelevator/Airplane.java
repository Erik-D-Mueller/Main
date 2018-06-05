package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Airplane {

	String planeNumber;
	
	int bookedFirstClassSeats;
	int totalFirstClassSeats;
	
	int availableFirstClassSeats=0;
	
	int bookedCoachSeats;
	int totalCoachSeats;
	
	int availableCoachSeats=0;

public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
	
	this.totalFirstClassSeats = totalFirstClassSeats;
	this.totalCoachSeats = totalCoachSeats;
	this.planeNumber = planeNumber;
	
	calculateNumbers();
	
}

public String getPlaneNumber() {
	return this.planeNumber;
}

public int getBookedFirstClassSeats() {
	calculateNumbers();
	return this.bookedFirstClassSeats;
}

public int getBookedCoachSeats() {
	calculateNumbers();
	return this.bookedCoachSeats;
	
}

public int getTotalFirstClassSeats() {
	
	return this.totalFirstClassSeats;
	
}

public int getTotalCoachSeats() {
	
	return this.totalCoachSeats;
	
}

public int getAvailableFirstClassSeats() {
	calculateNumbers();
	return this.availableFirstClassSeats;
}

public int getAvailableCoachSeats() {
	calculateNumbers();
	
	return this.availableCoachSeats;
}


public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
	
	calculateNumbers();  // Update the variables
	
	if(forFirstClass && totalNumberOfSeats <= availableFirstClassSeats) {
		
				this.bookedFirstClassSeats += totalNumberOfSeats;
				return true;
		
			}
			
	if(!forFirstClass && totalNumberOfSeats <= availableCoachSeats) {
		this.bookedCoachSeats += totalNumberOfSeats;
		
		return true;
		
	}
		return false;
}

private void calculateNumbers() {
	
	this.availableFirstClassSeats = this.totalFirstClassSeats - this.bookedFirstClassSeats;
	
	this.availableCoachSeats = this.totalCoachSeats - this.bookedCoachSeats;
	
}


}
