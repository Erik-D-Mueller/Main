package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AirplaneTest {

int	coachSeats = 30;
int firstClassSeats = 40;
	
	Airplane zippy = new Airplane(firstClassSeats, coachSeats);
	
	@Before
	public void setup() {
		
		Airplane zippy;
		zippy = new Airplane(firstClassSeats, coachSeats);
		
	}
	
	@Test
	public void testGetters() {
		Assert.assertEquals(firstClassSeats,  zippy.getAvailableFirstClassSeats());
		Assert.assertEquals(coachSeats,  zippy.getAvailableCoachSeats());
		
	}
	
	@Test
	public void ReserveFunction() {
		
		Assert.assertEquals("Test reserve all coach seats", true, zippy.Reserve(false, coachSeats));
		
		// After the above call, there should be zero coach seats still available.
		
		Assert.assertEquals("Should be zero coach seats still available", 0, zippy.getAvailableCoachSeats());
		Assert.assertEquals("Should be all firstClass seats still available", firstClassSeats, zippy.getAvailableFirstClassSeats());
		
		Assert.assertEquals("Test reserve all coach seats", false, zippy.Reserve(false, 1));
		
		//Should all be the same
		
		Assert.assertEquals("Should be zero coach seats still available", 0, zippy.getAvailableCoachSeats());
		Assert.assertEquals("Should be all firstClass seats still available", firstClassSeats, zippy.getAvailableFirstClassSeats());
	
		Assert.assertEquals("Test reserve all firstClassSeats", true, zippy.Reserve(true, firstClassSeats));
		
		
		Assert.assertEquals("Should be zero first class seats still available", 0, zippy.getAvailableFirstClassSeats());
		Assert.assertEquals("Should be zero first class seats still available", 0, zippy.getAvailableFirstClassSeats());
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
