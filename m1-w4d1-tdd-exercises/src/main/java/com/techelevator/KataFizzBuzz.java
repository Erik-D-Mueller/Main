package com.techelevator;

public class KataFizzBuzz {

	public static String fizzBuzz(int number) {
		
		if(number<1 || number > 100) { return ""; }
		
		if(number%3==0 && number%5==0) { return "FizzBuzz";}
		
		if(number%3==0) { return "Fizz"; }
		
		if(number%5==0) { return "Buzz";}
		
		return "";
		
	}

}
