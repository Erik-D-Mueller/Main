
// Note:  The files from this program are saved into src/main/resources
 
package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);  // userInput is like a "scanner" object
		String fileName = "FizzBuzz.txt";
			
		//This gets ready to create a new file
		//newFile is like a "file" object
		File newFile = new File("/Users/emueller/Development/erikmueller-java-green-exercises/m1-w4d3-file-io-part2-exercises/src/main/resources", fileName);
		
		try {
			newFile.createNewFile();  // This creates the new file
		} catch (IOException e1) {	System.out.println("Some type of error #3438");	e1.printStackTrace();}
		
		
		System.out.println();
		System.out.println("Please enter the number to be analyzed: ");
		String numberString = userInput.nextLine();
		
		
		try(PrintWriter writer = new PrintWriter(newFile)) {  // This opens the "write" channel to the file
		
			writer.println(fizzBuzz(Integer.parseInt(numberString)));   }// write the result of the FizzBuzz analysis to the file
		 
		// When we exit the try block, this cause the file to be closed and an automatic flush of the buffer to trigger
 
		catch (FileNotFoundException e) {	System.out.println("Some Type of Error #3458");		e.printStackTrace();	}
		
		System.out.println("Finito!");
	}

	
public static String fizzBuzz(int number) {
		
		if(number<1 || number > 100) { return ""; }
		
		if(number%3==0 && number%5==0) { return "FizzBuzz";}
		
		if(number%3==0) { return "Fizz"; }
		
		if(number%5==0) { return "Buzz";}
		
		return "";
		
		}

		
	
}
