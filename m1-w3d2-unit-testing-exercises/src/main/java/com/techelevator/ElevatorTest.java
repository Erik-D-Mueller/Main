package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

public class ElevatorTest {

	Elevator rusty = new Elevator(7,20);
	
public void does_not_move_when_doors_are_open() {
	
	rusty.OpenDoor();
	
	int currentFloor = rusty.getCurrentLevel();
	
	rusty.GoUp(16);
	
	Assert.assertEquals("Shouldn't Move when doors are open", currentFloor, rusty.getCurrentLevel());  // It should not have moved
	
	rusty.CloseDoor();
	
	rusty.GoUp(8);
	
	Assert.assertEquals("Shouldn't Move when doors are open", 8, rusty.getCurrentLevel());  // It should not have moved
	
	}


@Test
public void cannot_go_above_top_floor() {
	
	Elevator rusty = new Elevator(7,20); //resets current level to 4
	
	rusty.CloseDoor();
	rusty.GoUp(20);	
	
	Assert.assertEquals("top floor of 20 first", 20, rusty.getCurrentLevel());  // Should be at 20th floor
	
	rusty.GoUp(30);
	
	Assert.assertEquals("top floor of 20 second", 20, rusty.getCurrentLevel());  //Should still be at 20th floor

}


@Test
public void cannot_go_below_bottom_floor() {
	
	rusty.CloseDoor();
	
	rusty.GoUp(15);
	
	rusty.GoDown(5);
	
	Assert.assertEquals("floor 5", 5, rusty.getCurrentLevel()); // Should be at 20th floor
	
	rusty.GoDown(1);
	
	Assert.assertEquals("bottom floor of 1", 1, rusty.getCurrentLevel());  // Should be at 20th floor
	
	rusty.GoDown(5);
	
	Assert.assertEquals("top floor of 1", 1, rusty.getCurrentLevel());  //Should still be at 20th floor

}

}
