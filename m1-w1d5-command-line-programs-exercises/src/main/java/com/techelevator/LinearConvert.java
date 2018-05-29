package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a length:");
		
		String length = userInput.nextLine();
		
		System.out.println("Is the measurement in (m)eters or (f)eet?");
		
		String unit = userInput.nextLine();
		
		int lengthNumber = (int) (Integer.parseInt(length));
		
		if(unit.equals("f")) {
			
			int result = (int) (lengthNumber * 0.3048);
			
			System.out.print(lengthNumber + "f is " + result + "m");
	
		}
		
		if(unit.equals("m")) {
			
			int result = (int) (lengthNumber * (1/0.3048));
			
			System.out.print(lengthNumber + "m is " + result + "f");
	
		}
		
		

		
	}

}
