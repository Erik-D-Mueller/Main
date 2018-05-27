package com.techelevator;

import java.util.Scanner;


/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/

public class DecimalToBinary {

	public static void main(String[] args) {

	int binaryArray[];
	
	binaryArray = new int[1000000];  // An array to hold the binary 0s & 1s
		
	Scanner userInput = new Scanner(System.in);
	
	String chunk = userInput.nextLine();
	
	String[] numsArray = chunk.split(" ");  //This apparently does the entire chunk of input
	
	
	
	int number = (int) (Integer.parseInt(numsArray[i]) * 0.378);
	
	
	
	
	
	
	/*
	 * 
	 * This loop looks for the biggest power of 2 that will fit inside the base10 number.  If
	 * it finds a power of 2 that fits exactly, then that is the highest power of 2 that fits.  
	 * If it does not find a power of 2 that fits exactly, then the previous power of is
	 * the largest that will fit, so it subtracts 1 from i.
	 * 
	 * 
	 */
	
	
	
	int topPosition = 0;
	for(int i=0; (2^i) < number; i++) {  
		if( (2^i)==number) { 		
			topPosition=i;
		}
		if( (2^i)>number) { 
			topPosition=i-1;
		}
	
	}
	
	/*
	 * So now the variable topPosition holds
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	}

}
