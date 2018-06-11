package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {
	
	String number = "6142345678";
	String carrier = "Verizon";
	
	
	
	SmartPhone myPhone = new SmartPhone(number, carrier);   // It needs this declaration here for intellisense to work
	
	@Before
	public void setUp() {

		SmartPhone myPhone = new SmartPhone(number, carrier);
		
	}
	
	
	@Test
	public void testGetters() {
		
		Assert.assertEquals(number, myPhone.getPhoneNumber());
		Assert.assertEquals(carrier, myPhone.getCarrier());	
	}

	
	@Test
	public void testCallingFunction() {
		
		Assert.assertEquals("Make sure phone is initially off", false, myPhone.isOnCall());
		Assert.assertEquals("Make sure battery is initally 100%", 100, myPhone.getBatteryCharge());
		
		
		Assert.assertEquals("Make a call of 100 minutes", true, myPhone.Call("5555555555", 100));   // Battery should go from 100 to 0 from this command
		
		Assert.assertEquals("make sure battery is at 0", 0, myPhone.getBatteryCharge());
		Assert.assertEquals("Make sure phone is ON", true, myPhone.isOnCall());
		
		myPhone.HangUp();
		
		Assert.assertEquals("Make sure phone is off after phone off command", false, myPhone.isOnCall());	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
