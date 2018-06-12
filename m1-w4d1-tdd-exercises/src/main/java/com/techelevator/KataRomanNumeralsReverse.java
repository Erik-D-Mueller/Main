package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;

public class KataRomanNumeralsReverse {

	/*
	 *The below array contains an index 1 to 6 and the letters associated with the numbers 5, 10,50,100,500,1000 
	 *
	 * POSITION O IS 1
	 * 1 IS 5
	 * 2 IS 10
	 * 3 IS 50
	 * 4 IS 100
	 * 5 IS 500
	 * 6 IS 1000
	 * 
	 */	
	
	public static void main(String[] args) {
	
	Scanner userInput=new Scanner(System.in);
	
	String stringRomanNumeral;

	String leftMostDigitWorkingWith;
	
	String romanNumeral="";
	
	String temp = "";
	
    int total=0;
    int sign = 1;  // this is 1 for positive, negative -1 for negative
	
	ArrayList<String> numerals = new ArrayList<String>();
	
	numerals.add("I");
	numerals.add("V");
	numerals.add("X");
	numerals.add("L");
	numerals.add("C");
	numerals.add("D");
	numerals.add("M");
	
	System.out.print("Enter a roman numeral between 1 and 3999: ");
	
	stringRomanNumeral= userInput.next();
		
	for(int i=0; i<stringRomanNumeral.length(); i++) {
		
		sign = 1;  // Reset to positive
		
		if(i+2 < stringRomanNumeral.length() ) {   // Don't let the "iterator" get out of bounds on the .substring, the last character has to be positive anyway before there is no character AFTER the last character to be negative
		
			if(  numerals.indexOf(  stringRomanNumeral.substring(i, i+1) ) < numerals.indexOf(  stringRomanNumeral.substring(i+1,i+2) ) ) {
		 
			sign = -1;   // iF the next character is bigger than the current, then the current character should be subtracted from the total
		}
		
		}
		
		System.out.println(stringRomanNumeral.substring(i, i+1));
		
		temp = stringRomanNumeral.substring(i, i+1);
		
		
		if(temp.contains("M"));
		
		{ total += 1000*sign; }
	
		
		if(temp.contains("D"))
		{ total += 500*sign; }
		
		
		{ total += 100*sign; }

		
		if(temp.contains("L"))		
		{ total += 50*sign; }
		
		
		if(temp.contains("X"))
		{ total += 10*sign; }
		
		
		if(temp.contains("V"))
		{ total += 5*sign; }
		
		
		if(temp.contains("I"))
		{ total += 1*sign; }
			
	}
	
	System.out.println(stringRomanNumeral + " in arabic is " + total );	
	
	}
	
}
