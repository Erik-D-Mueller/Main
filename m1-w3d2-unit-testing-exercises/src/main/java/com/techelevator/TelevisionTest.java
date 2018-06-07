package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class TelevisionTest {

	Television myTv = new Television();  //Has no initial input values
	
	@Before
	public void setup() {
		
		Television myTv = new Television();
		
	}
	
	@Test
	public void check_Volume_boundary_limits(){
		
		Television myTv = new Television();  // This resets volume to 2
		
		myTv.TurnOn();  // Turn the Tv on
		
		Assert.assertEquals("Check acceptable volume: ", 2, myTv.getCurrentVolume());
		
		myTv.RaiseVolume();
		myTv.RaiseVolume();
		
		Assert.assertEquals("Check acceptable volume: ", 4, myTv.getCurrentVolume());
	
		myTv.LowerVolume();
		myTv.LowerVolume();
		myTv.LowerVolume();
		myTv.LowerVolume();
		myTv.LowerVolume();
		myTv.LowerVolume();
	
		Assert.assertEquals("Make sure volume is not below zero", 0, myTv.getCurrentVolume());  // It should still be 9
	
	}
	
	public void does_volume_resest_when_tv_turned_on() {
		
		myTv.TurnOn();
		
		myTv.RaiseVolume();
		myTv.RaiseVolume();
		myTv.RaiseVolume();
		myTv.RaiseVolume();
		
		Assert.assertEquals("Does the volume reset to 6? ", 6, myTv.getCurrentVolume());
		
		myTv.TurnOn();  // It works even if the tv was not off
		
		Assert.assertEquals("Does the volume reset to 2? ", 2, myTv.getCurrentVolume());
		
		
	}
	
	
	
	

	

}
