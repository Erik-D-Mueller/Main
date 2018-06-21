package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {
	
	Car car1 = new Car(true);
	
	@Test
	public void testCarRate() {
	
		Car car1 = new Car(true);
		
		assertEquals("Test toll price of car",car1.calculateToll(10), 1 + 0.02*10, 0.0);
		
	}	
	
	@Test
	public void testTruckRate1() {
	
		Truck truck1 = new Truck(4);
		
		assertEquals("Test toll price of truck",truck1.calculateToll(10), 0.04*10, 0.0);
	
	}
	
	@Test
	public void testTruckRate2() {
	
		Truck truck1 = new Truck(10);
		
		assertEquals("Test toll price of truck",truck1.calculateToll(100), 0.048*100, 0.0);
	
	}
	
	
	@Test
	public void testTankRate() {
	
		Tank tank1 = new Tank();
		
		assertEquals("Test toll price of tank",tank1.calculateToll(10), 0.0, 0.0);	  // Tanks are always free	
	
	}
	

}