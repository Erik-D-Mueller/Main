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
	
	int[] binaryArray;
		
	binaryArray = new int[1000000];  // An array to hold the binary 0s & 1s
		
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Please enter in a series of decimal values (seperated by spaces)");
	
	String chunk = userInput.nextLine();
	
	String[] numsArray = chunk.split(" ");  //This apparently does the entire chunk of input
	
	
	for(int i=0; i<numsArray.length; i++) {    //This loop runs once for each base10 number
	
int base10Number = (int) (Integer.parseInt(numsArray[i]));  // Put the base10 number into the variable base10Number
	

	/*
	 * The following loop looks for the biggest power of 2 that will fit inside the base10 number.
	 * It inserts the number into "topPosition" variable.
	 */
	
	int topPosition = 0;
	
	//System.out.println("The base10Number is " + base10Number);
	
	
	for(int j=0; true; j++) {  
		
		
		
		if( (Math.pow(2, j))==base10Number) { 		
			topPosition=j;
			break;
		}
		if( (Math.pow(2,j))>base10Number) { 
			topPosition=j-1;
			break;
		}
	
	
	}
	
	
	
	//System.out.println("The top position variable is " + topPosition + ". ");
	
	 //  So now the variable "topPosition" holds the biggest power of 2 that will fit
	
	
	
	/*
	 * The equations for converting from base10 to binary is to find the biggest power of 2	
	 * that will fit inside the base number, mark that position as a 1, subtract
	 * that base10 value from the base10 number, then find the next biggest power of 2 number
	 * that will fit inside of the value of what's left, and keep going down from there.
	 */

	
	for(int k=0; k< topPosition;k++) {  //this resets all the necesary parts of binary array to zero
		
		binaryArray[k]=0;
	}
	

	binaryArray[topPosition]=1;  //Assign a 1 to the biggest power of 2 that will fit inside the base 10 number
	
	System.out.println(""); //Start a new line for the next base10Number
	
	System.out.print(base10Number + " in binary is ");
	

	do{
		 
		if(Math.pow(2.0,  topPosition)<=base10Number) { //If the power of 2 can be subtracted from the base10number then mark it a 1, otherwise it is left as a zero.
			binaryArray[topPosition]=1;
		
			base10Number-= (Math.pow(2.0,  topPosition));  //Subtract that value from the base10 number, since it has been accounted for
			
		}
	
		System.out.print(binaryArray[topPosition]);
		
		
		topPosition--;     //Move down by a power of 2
		
	}while(topPosition>=0);
	 
	 


	
	}
	
	
	
	
	
	
}
	
}
	
	
	
	
	
	
	
	


