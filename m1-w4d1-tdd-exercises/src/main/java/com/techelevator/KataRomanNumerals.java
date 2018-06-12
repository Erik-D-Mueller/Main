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
	
	public static void main(String[] args) {
	
	Scanner userInput=new Scanner(System.in);
	
	String stringDecimalNumber;

	String leftMostDigitWorkingWith;
	
	String romanNumeral="";
	
	int thousands=0;
	int hundreds=0;
	int tens=0;
	int ones=0;
	
	String[] numerals = {"I", "V", "X", "L", "C", "D", "M"};
	
	System.out.print("Enter a number between 1 and 3999 inclusive: ");
	
	stringDecimalNumber = userInput.next();
		
	
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
	
	System.out.println(stringDecimalNumber + " in roman numerals is " + romanNumeral );
		
	
	
	}
	
}
