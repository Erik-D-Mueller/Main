package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class KataFizzBuzzTest {

	
	@Test
	public void numberRange() {
		
		Assert.assertEquals("Numbers below 1 or above 100 should return an empty string. ", "", KataFizzBuzz.fizzBuzz(0));
		Assert.assertEquals("Numbers below 1 or above 100 should return an empty string. ", "", KataFizzBuzz.fizzBuzz(101));
		
	}

	@Test
	public void multipleOfThreeButNotFive() {
		
		Assert.assertEquals("33 should return fizz", "Fizz", KataFizzBuzz.fizzBuzz(33));
		Assert.assertEquals("60 should return fizz", "Fizz", KataFizzBuzz.fizzBuzz(63));
		Assert.assertEquals("21 should return fizz", "Fizz", KataFizzBuzz.fizzBuzz(21));
		
	}
	
	@Test
	public void multipleOfFiveButNotThree() {
			
		Assert.assertEquals("25 should return fizz", "Buzz", KataFizzBuzz.fizzBuzz(25));
		Assert.assertEquals("55 should return fizz", "Buzz", KataFizzBuzz.fizzBuzz(55));
		Assert.assertEquals("85 should return fizz", "Buzz", KataFizzBuzz.fizzBuzz(85));
		
	}

	@Test
	public void multipleOfBoth() {
			
		Assert.assertEquals("30 should return fizz", "FizzBuzz", KataFizzBuzz.fizzBuzz(30));
		Assert.assertEquals("90 should return fizz", "FizzBuzz", KataFizzBuzz.fizzBuzz(90));
		Assert.assertEquals("60 should return fizz", "FizzBuzz", KataFizzBuzz.fizzBuzz(60));
		
	}
		
	
}