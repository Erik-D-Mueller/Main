package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShippingTest {

	@Test
	public void testFedex() {
		
		FedEx fdx1 = new FedEx();
		
		assertEquals("Test Fedex Shipping Rate", fdx1.calculateRate(30, 100), 20, 0.0);
		
		assertEquals("Test Fedex Shipping Rate", fdx1.calculateRate(49, 501), 20+5+3, 0.0);
			
	}

	
public void testUPS1stClass() {
		
		UPSFirstClass ups1st = new UPSFirstClass();
		
		assertEquals("TestUPS 2nd class", ups1st.calculateRate(30, 100), ((30.0/16.0)* 0.075 * 100.0), 0.0);
		
	}
	
	
	
public void testUPS2ndClass() {
	
	UPSSecondClass ups2nd = new UPSSecondClass();
	
	assertEquals("TestUPS 2nd class", ups2nd.calculateRate(30, 100), ((30.0/16.0)* 0.050 * 100.0), 0.0);
	
}
	
	
	@Test
	public void testUPS23rdClass() {
		
		UPSThirdClass ups3rd = new UPSThirdClass();
		
		assertEquals("TestUPS 2nd class", ups3rd.calculateRate(30, 100), ((30.0/16.0)* 0.0050 * 100.0), 0.0);
		
	}
		
	
	@Test
	public void testPostalServiceFirstClass() {
		
		PostalServiceFirstClass ps1st = new PostalServiceFirstClass();
		System.out.println(ps1st.calculateRate(30, 100));
		assertEquals("Test Postal Service first class", ps1st.calculateRate(30, 100), 0.195*100, 0.0);
			
	}	
	
	
	@Test
	public void testPostalServiceSecondClass() {
		
		PostalServiceSecondClass ps2nd = new PostalServiceSecondClass();
		System.out.println(ps2nd.calculateRate(30, 100));
		assertEquals("Test Postal Service 2nd class", ps2nd.calculateRate(30, 100), 0.0195*100, 0.0);
			
	}	
	@Test
	public void testPostalServiceThirdClass() {
		
		PostalServiceThirdClass ps3rd = new PostalServiceThirdClass();
		System.out.println(ps3rd.calculateRate(30, 100));
		assertEquals("Test Postal service 3rd class", ps3rd.calculateRate(30, 100), 0.0150*100, 0.0);
			
	}	
	
	
}
