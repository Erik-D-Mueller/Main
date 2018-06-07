package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {


	private Employee robert = new Employee(1, "Bob", "Barker", 100000);
	
	@Before
	public void setup() {  //This resets the bob employee before each test
		
		robert = new Employee(1, "Bob", "Barker", 100000);
		
		
	}
	
	
	@Test
	public void check_if_raise_method_works(){
		
		Assert.assertEquals("message", 100000, robert.getAnnualSalary(), .001);   // THis makes it avoid a deprecated statement

		robert.RaiseSalary(10);
		
		Assert.assertEquals("raise salary by 10%, 100k to 110k: ", 110000, robert.getAnnualSalary(), .001);
		
	}
	
	
	
	
	
	
	
	
	}


