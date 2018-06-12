package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {
		
		String tempHolder;
		int previousPipe;
		int indexOfAnswer;
		
		File inputFile = getInputFileFromUser();   // Call method to get file name
	
		ArrayList<String> listOfQuestions=new ArrayList<String>();   // At index 0 is the question, above are the answers
		
		Scanner fileScanner = new Scanner(inputFile);  // This opens the channel to the file	
		
		while(fileScanner.hasNextLine()) {  // this loop runs once for each line in the file
			
			String line = fileScanner.nextLine();
		
			QuizQuestion question= new QuizQuestion();
			
			
			// The below splits the line string into the chunks between the pipes
			String[] chunks = line.split("|");
			
			
			
			
			
			
			// This loop finds the index of the string with an asterisk at the end, which is the answer and sets it in the object.
			// It starts at 1 because the question itself is at index 0
			for(int i = 1; i< chunks.length; i++) {
			
					if(chunks[i].endsWith("*")) 
					{	
						
						question.setCorrectAnswerNumber(i);
					}
				
	
				}
			
			for(int i = 1; i< chunks.length; i++) {  // This loop loads all the answers from chunks into an answers array, one at a time	

				question.setUpAnswers(chunks[i]);
			
			}
			
		
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
				
				
				
				
				
				
				
			
			

		
		
			
			
			
			
		
	
		
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

	private static void printQuestionAndAnswers() {
		
		
		
		
	}
	
	
	
	
	
	
}
