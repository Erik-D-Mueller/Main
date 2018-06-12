package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;

public class KataRomanNumerals {

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
	
	
	
	public static String normalToRoman(int number) {    //  This function converts arabic numbers to Roman Numerals
		
		
	// Scanner userInput=new Scanner(System.in);
	
	String stringDecimalNumber;

	String leftMostDigitWorkingWith;
	
	String romanNumeral="";
	
	int thousands=0;
	int hundreds=0;
	int tens=0;
	int ones=0;
	
	String[] numerals = {"I", "V", "X", "L", "C", "D", "M"};
	
	// 				System.out.print("Enter a number between 1 and 3999 inclusive: ");
	
	// 				stringDecimalNumber = userInput.next();
		
	stringDecimalNumber = String.valueOf(number);   // Convert the integer to a string
	
	/* The below loop chops up the number.
	 * 
	 * 1776 becomes:
	 * 
	 * thousands = 1
	 * hundreds = 7
	 * tens = 7
	 * ones = 6
	 * 
	 */
	
	
	for(int i=0; i<stringDecimalNumber.length(); i++) { 
		
			leftMostDigitWorkingWith = stringDecimalNumber.substring(i, i+1);
		
			if(stringDecimalNumber.length()-i==4) {	thousands = Integer.parseInt(leftMostDigitWorkingWith);	}
		
			if(stringDecimalNumber.length()-i==3) {	hundreds = Integer.parseInt(leftMostDigitWorkingWith);	}
		
			if(stringDecimalNumber.length()-i==2) {	tens = Integer.parseInt(leftMostDigitWorkingWith);	}
		
			if(stringDecimalNumber.length()-i==1) {	ones = Integer.parseInt(leftMostDigitWorkingWith);	}
		
	}
	
		/*
		 * So now I have the base10Decimal number converted into
		 * 
		 * 1776
		 * 
		 * thousands = 1
		 * hundreds = 7
		 * tens = 7
		 * ones = 6
		 * 
		 */
		
	
		if( thousands == 3) {
			romanNumeral = romanNumeral.concat(numerals[6]);
			romanNumeral = romanNumeral.concat(numerals[6]);
			romanNumeral = romanNumeral.concat(numerals[6]);
		}
		if(thousands == 2 ) {	
			romanNumeral = romanNumeral.concat(numerals[6]);
			romanNumeral = romanNumeral.concat(numerals[6]);	
		}
		if(thousands == 1 ) {	
			 romanNumeral = romanNumeral.concat(numerals[6]);	
		}
		
		
		if(hundreds == 9 ) {	
			romanNumeral = romanNumeral.concat(numerals[4]);
			romanNumeral = romanNumeral.concat(numerals[6]);	
		}
		
		if(hundreds ==8 ) {	
			romanNumeral = romanNumeral.concat(numerals[5]);
			romanNumeral = romanNumeral.concat(numerals[4]);	
			romanNumeral = romanNumeral.concat(numerals[4]);
			romanNumeral = romanNumeral.concat(numerals[4]);
		}
		if(hundreds == 7 ){	
			romanNumeral = romanNumeral.concat(numerals[5]);
			romanNumeral = romanNumeral.concat(numerals[4]);	
			romanNumeral = romanNumeral.concat(numerals[4]);
		}
		if(hundreds == 6){
			romanNumeral = romanNumeral.concat(numerals[5]);
			romanNumeral = romanNumeral.concat(numerals[4]);	
		}
		
		if(hundreds ==5 ) {	
			romanNumeral = romanNumeral.concat(numerals[5]);
		}
		if(hundreds == 4 ){	
			romanNumeral = romanNumeral.concat(numerals[4]);	
			romanNumeral = romanNumeral.concat(numerals[5]);
		}
		if(hundreds == 3){
			romanNumeral = romanNumeral.concat(numerals[4]);
			romanNumeral = romanNumeral.concat(numerals[4]);	
			romanNumeral = romanNumeral.concat(numerals[4]);
		}
		if(hundreds == 2 ){	
			romanNumeral = romanNumeral.concat(numerals[4]);	
			romanNumeral = romanNumeral.concat(numerals[4]);
		}
		if(hundreds == 1){
			romanNumeral = romanNumeral.concat(numerals[4]);	
		}
		
		
		
		
		
		if(tens == 9 ) {	
			romanNumeral = romanNumeral.concat(numerals[2]);
			romanNumeral = romanNumeral.concat(numerals[4]);	
		}
		
		if(tens ==8 ) {	
			romanNumeral = romanNumeral.concat(numerals[3]);
			romanNumeral = romanNumeral.concat(numerals[2]);	
			romanNumeral = romanNumeral.concat(numerals[2]);
			romanNumeral = romanNumeral.concat(numerals[2]);
		}
		
		if(tens == 7 ){	
			romanNumeral = romanNumeral.concat(numerals[3]);
			romanNumeral = romanNumeral.concat(numerals[2]);	
			romanNumeral = romanNumeral.concat(numerals[2]);
		}
		if(tens == 6){
			romanNumeral = romanNumeral.concat(numerals[3]);
			romanNumeral = romanNumeral.concat(numerals[2]);	
		}
		
		if(tens ==5 ) {	
			romanNumeral = romanNumeral.concat(numerals[3]);
		}
		if(tens == 4 ){	
			romanNumeral = romanNumeral.concat(numerals[2]);	
			romanNumeral = romanNumeral.concat(numerals[3]);
		}
		if(tens == 3){
			romanNumeral = romanNumeral.concat(numerals[2]);
			romanNumeral = romanNumeral.concat(numerals[2]);	
			romanNumeral = romanNumeral.concat(numerals[2]);
		}
		if(tens == 2 ){	
			romanNumeral = romanNumeral.concat(numerals[2]);	
			romanNumeral = romanNumeral.concat(numerals[2]);
		}
		if(tens == 1){
			romanNumeral = romanNumeral.concat(numerals[2]);	
		}
	
	
	
	
		
		
		if(ones == 9 ) {	
			romanNumeral = romanNumeral.concat(numerals[0]);
			romanNumeral = romanNumeral.concat(numerals[2]);	
		}
		
		if(ones ==8 ) {	
			romanNumeral = romanNumeral.concat(numerals[1]);
			romanNumeral = romanNumeral.concat(numerals[0]);	
			romanNumeral = romanNumeral.concat(numerals[0]);
			romanNumeral = romanNumeral.concat(numerals[0]);
		}
		
		if(ones == 7 ){	
			romanNumeral = romanNumeral.concat(numerals[1]);
			romanNumeral = romanNumeral.concat(numerals[0]);	
			romanNumeral = romanNumeral.concat(numerals[0]);
		}
		if(ones == 6){
			romanNumeral = romanNumeral.concat(numerals[1]);
			romanNumeral = romanNumeral.concat(numerals[0]);	
		}
		
		if(ones ==5 ) {	
			romanNumeral = romanNumeral.concat(numerals[1]);
		}
		if(ones == 4 ){	
			romanNumeral = romanNumeral.concat(numerals[0]);	
			romanNumeral = romanNumeral.concat(numerals[1]);
		}
		if(ones == 3){
			romanNumeral = romanNumeral.concat(numerals[0]);
			romanNumeral = romanNumeral.concat(numerals[0]);	
			romanNumeral = romanNumeral.concat(numerals[0]);
		}
		if(ones == 2 ){	
			romanNumeral = romanNumeral.concat(numerals[0]);	
			romanNumeral = romanNumeral.concat(numerals[0]);
		}
		if(ones == 1){
			romanNumeral = romanNumeral.concat(numerals[0]);	
		}
	
	//				System.out.println(stringDecimalNumber + " in roman numerals is " + romanNumeral );
		
	return romanNumeral;
	
	}   // End of function to convert arabic to roman numerals
	
	
	
	
	
	
	
	
	public static int romanToNormal(String romanNumber) {   // Beginning of method to convert roman to arabic
		
	// 		Scanner userInput=new Scanner(System.in);
	
	String stringRomanNumeral;

	String leftMostDigitWorkingWith;
	
	String romanNumeral="";
	
	String temp = "";
	
    int total=0;
    int sign = 1;  // this is 1 for positive, -1 for negative
	
	ArrayList<String> numerals = new ArrayList<String>();
	
	numerals.add("I");  //Index 0
	numerals.add("V"); // 1
	numerals.add("X"); // 2
	numerals.add("L"); // 3
	numerals.add("C"); // 4
	numerals.add("D"); // 5
	numerals.add("M"); // 6
	
	// 		System.out.print("Enter a roman numeral between 1 and 3999: ");
	
	// 		stringRomanNumeral= userInput.next();
	
	stringRomanNumeral = romanNumber;
		
	for(int i=0; i<stringRomanNumeral.length(); i++) {
	
		
		sign = 1;  // Reset to positive
		
		if(i+1 < stringRomanNumeral.length() ) {   // Don't let the "iterator" get out of bounds on the .substring, the last character has to be positive anyway because there is no character AFTER the last character to be negative
		
			if(  numerals.indexOf(  stringRomanNumeral.substring(i, i+1) ) < numerals.indexOf(  stringRomanNumeral.substring(i+1,i+2) ) ) {
		 
			sign = -1;   // iF the next character is bigger than the current, then the current character should be subtracted from the total, instaed of added to the total
		
			}
		
		}
		
		temp = stringRomanNumeral.substring(i, i+1);
		
		
		if(temp.contains("M"))
		{ total += 1000*sign; }
	
		
		if(temp.contains("D"))
		{ total += 500*sign; }
		
		
		if(temp.contains("C"))
		{ total += 100*sign; }

		
		if(temp.contains("L"))		
		{ total += 50*sign; }
		
		
		if(temp.contains("X"))
		{ total += 10*sign; }
		
		
		if(temp.contains("V"))
		{ total += 5*sign; }
		
		
		if(temp.contains("I"))
		{ total += (1*sign); }
			
	}
	
	return total;
	
	}
	
	
	}
	
