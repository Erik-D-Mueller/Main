package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		
		String fileName = "FizzBuzz.txt";
			
		//This gets ready to create a new file
		//newFile is like a "file" object
		File newFile = new File( fileName);
		
		try {
			newFile.createNewFile();  // This creates the new file
			
		} catch (IOException e1) {	System.out.println("Some type of error #3438");	e1.printStackTrace();}
		
		try(PrintWriter writer = new PrintWriter(newFile)) {  // This opens the "write" channel to the file
	
			
			for(int counter=1; counter<=300; counter++)
			{
			writer.println(fizzBuzz(counter)); // write the result of the FizzBuzz analysis to the file
			}
			
		}
		 
		// When we exit the try block, this causes the file to be closed and an automatic flush of the buffer to trigger
 
		catch (FileNotFoundException e) {	System.out.println("Some Type of Error #3458");		e.printStackTrace();	}
		
		System.out.println("Finito!");
	}
		
public static String fizzBuzz(int number) {
				
		if(number%3==0 && number%5==0) { return "FizzBuzz";}
		
		if(number%3==0) { return "Fizz"; }
		
		if(number%5==0) { return "Buzz";}
		
		return  String.valueOf(number);  // It only  gets here if the number is not visible by either 3 or 5
		
		}
}
