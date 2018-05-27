package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number for me to display the fibbonacci sequence up to:");
		
		String characters = userInput.nextLine();
		
		int number = Integer.parseInt(characters);
		
	int fibArray[];

	fibArray = new int[1000000]; // I find it easiest to use an array
	
	fibArray[0]=0;   //The first two digits of the fibbonnacci sequence are 0 and 1 regardless
	fibArray[1]=1;
	
	System.out.print("0, 1, ");  //// The first two digits of the fibbonnacci sequence are 0 and 1 by defn, regardless

	int i=1;  // counter variable
	
	while(true){  
		
		i++;
		
		fibArray[i]=fibArray[i-1]+fibArray[i-2];
		
		if(fibArray[i]>number) { break; }
			
		System.out.print(fibArray[i] + ", ");
	
	}
	
	}		
				
	}