package com.techelevator.calculator;

public class Calculator {

	private int currentValue;
	
	public Calculator() {  //classes appear to need to be public for some reason
		
		this.currentValue = 0;  //I'm used to c++ so I like to play it safe and declare things zero
		
	}

	public int add(int input) {
		
		return this.currentValue += input;
		
	}
	public int subtract(int input) {
		
		return this.currentValue -= input;

		
	}
	
	public int multiply(int input) {
		
		currentValue = currentValue * input;
		return currentValue;

	}
	
	public void reset() {
		
		this.currentValue = 0;
	}
	
	public int	getCurrentValue(){
		
		return this.currentValue;		
		
	}
	
	public int power(int input) {
		
		currentValue = (int) Math.pow((double)currentValue, (double)input);
		 return currentValue;
		
	}
	
	
	
	
}
