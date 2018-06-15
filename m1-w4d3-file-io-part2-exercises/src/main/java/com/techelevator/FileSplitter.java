package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;

public class FileSplitter {

	public static void main(String[] args) {
		
			// Call method to get file name, turn it into a scanner and return scanner object	
			Scanner fileScanner = getInputFileFromUser();   
		
			// Call method to get number of Lines between each chop	
			int numberOfLines = getStringChopLength();		
			
			// Send the fileScanner to this method to process the file into lines and put the lines into an ArrayList
			ArrayList<String> arrayListOfLines = chopUpSourceFile(fileScanner); 
			
			// Send the arrayList and the number of lines per chunk and this method writes the new files.
			try { writeToFile(numberOfLines, arrayListOfLines);	} catch (FileNotFoundException e) {  e.printStackTrace();  }  
		}
	
	
	//This method gets the file name from the user and returns a scanner object for it
	private static Scanner getInputFileFromUser() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		Scanner fileScanner = null;//Must be declared outside of block for larger scope visibility
		try {
				fileScanner = new Scanner(inputFile);  // This opens the channel to read the file
			} catch (FileNotFoundException e) {		e.printStackTrace();		}  
		return fileScanner;
	}	
	
	
	// This method asks for the number of lines in between each file chop and returns it as an integer
	private static int getStringChopLength() {             
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the number of lines per output chunk: ");
		String stringChopLength = userInput.nextLine();	
		return Integer.parseInt(stringChopLength);	
	}
	
	
	// This method accepts the file Scanner and returns an ArrayList with each element representing one line of text
	private static ArrayList<String> chopUpSourceFile(Scanner fileScanner){    
		ArrayList<String> arrayListOfLines = new ArrayList<String>();
		// this loop runs once for each line in the file
		while(fileScanner.hasNextLine()) {  
			// Add the file, one line at a time, into a listArray of strings
			arrayListOfLines.add(fileScanner.nextLine());   	
		}
		return arrayListOfLines;		
	}
	
	
	// This method accepts the ArrayList and the number of lines in between cut and actually writes the files
	private static void writeToFile(int numberOfLines, ArrayList<String> arrayListOfLines) throws FileNotFoundException{
			
		// This loop runs once for each arrayList element, which represent lines of text
		// currentLineObject gets updated other places as well, not just here
		for(int currentLineObjectNumber=0; currentLineObjectNumber < arrayListOfLines.size(); currentLineObjectNumber++) {  
		
		// This loops runs once for each chunk/file, we have to change the name for each file, thats why we have this loop  (but currentLineObjectNumber gets updated inside of it)
		for(int x=1;	currentLineObjectNumber < arrayListOfLines.size();	x++) {  		
			
			// The below line makes the file, called Output- and then the number from the counter x from the outer loop
			File newFile = new File("/Users/emueller/Development/erikmueller-java-green-exercises/m1-w4d3-file-io-part2-exercises/src/main/resources", "Output-".concat( Integer.toString(x)));
			
			try {
				newFile.createNewFile();
			} catch (IOException e) {		e.printStackTrace();		}

			 // This opens the "write" channel to the file
			PrintWriter writer = new PrintWriter(newFile);  
			
			// the below loop runs once for each line and starts up again for each separate file chunk
			for(int i =0; i < numberOfLines && currentLineObjectNumber < arrayListOfLines.size(); i++ ) {    

				// Write that line to the file					
				writer.println(arrayListOfLines.get(currentLineObjectNumber));
					
				//Update the current lineNumber variable
				currentLineObjectNumber++; 		
			}
			
			writer.close(); // Closes the file so that everything gets saved. The program doesn't work without this line.
			
			}// end of loop that runs once for each chunk/file
			
		} // End of loop that runs once for every line beginning to end
		
		} // end of writeToFile method
			
		}//end of class
