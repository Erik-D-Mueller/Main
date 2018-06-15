package com.techelevator;


/*
 * The way this program works is that it reads in the file name from the console, sucks in the file one line at a time, then there is a dot-substring iterator which
 * is the character-width of the the search word and it moves from left to right through the line searching if that little combination of letters happens to match
 * the search word.  If it matches then it prints that line to the screen and moves on to loading the next line.
 * 
 * The one weakness of this is that it will not find a word spread across two lines, like:
 * 
 * Al-
 * ice
 * 
 * 
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		int lineNumberCounter = 0;
		
		File inputFile = getInputFileFromUser();   // Call method to get file name
		
		String searchWord = getSearchWord();	// Call method to get search word
		
		boolean wordHasBeenFound = false;  // This is a flag used later on
	
		int lengthOfSearchWord = searchWord.length();
		
		
		Scanner fileScanner = new Scanner(inputFile);  // This opens the channel to the file	
			
			while(fileScanner.hasNextLine()) {  // this loop runs once for each line in the file
				
				String line = fileScanner.nextLine();
				
				lineNumberCounter++;
				
				
				for( int i=0; i + lengthOfSearchWord <= line.length()  &&  !wordHasBeenFound; i++) {  
						
					
					if(		line.substring(i, i+lengthOfSearchWord).contains(searchWord)		) {
						
						wordHasBeenFound = true;
						
						System.out.println(lineNumberCounter + ") " + line);   // The wordHasBeenFound flag prevents the same line from getting printed twice, if the word occurs twice on that line
						
					}
						
				
				}
				
				wordHasBeenFound = false;
				
				}
				
		}
		

	private static File getInputFileFromUser() {
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
		return inputFile;
	}	
	
	
	
	//  The below method is for obtaining the search word
	private static String getSearchWord() {             
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the word to search for, case sensitive: ");
		String searchWord = userInput.nextLine();	
		return searchWord;
		
	}


}

