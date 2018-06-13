package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		int numberOfQuestionsAnsweredCorrectly=0;
			
		File inputFile = null;   // I have to declare it outside the try-block because otherwise its scope will be limited to the try block
		
		do {
		
			try{
				
					inputFile = getInputFileFromUser();   // This method gets and returns the file name			
				
			}
			
		
		catch(Exception e) {
			
					System.out.println("File not found, or invalid file name, please try again");		
					
					}
			
		} while(	!inputFile.canRead()	);

	
		ArrayList<QuizQuestion> listOfQuestions=new ArrayList<QuizQuestion>(); // This array holds the objects/questions, one object for each question
		
		
		Scanner fileScanner = new Scanner(inputFile);  // This opens the channel to the file	
		
		
		while(fileScanner.hasNextLine()) {  // this loop runs once for each line in the file
			
			String line = fileScanner.nextLine();
		
			QuizQuestion question = new QuizQuestion();
			
			
			// The below splits the line string into the chunks between the pipes
			String[] chunks = line.split("\\|");
			
			
			// This loop finds the index of the string with an asterisk at the end, which is the answer and sets it in the object.
			// It starts at 1 because the question itself is at index 0
			
			question.setQuestion( chunks[0] );   // The first part is the question
			
			for(int i = 1; i < chunks.length; i++) {
			
					
					// This if statement identifies the answer that has an *, documents that it's the correct answer, then cuts off the *
					if(chunks[i].endsWith("*")) 
					{	
						chunks[i] = chunks[i].substring(0, chunks[i].length()-1);  // This cuts off the asterisk
						question.setCorrectAnswerIndexNumber(i-1);   // This sends the index number of the correct answer
					}
				
				question.setUpAnswers(chunks[i]);
			
			}
			
			listOfQuestions.add(question);  // Now that we have everything neatly into the "question" object, we deposit the object into the listOfQuestionsArray
	
			
		}
			
			
			
/*
 * So now we have listOfQuestions, an array with an object for each question
 * 
 */
			
			


boolean invalidAnswerFlag = false;

for(int i=0; i<listOfQuestions.size(); i++) {    // This loop iterates once for each question
	
	invalidAnswerFlag = false;
	
	
	
	do {   // This loop runs until they enter a valid answer number, even if it's wrong
	
	try{
	
		listOfQuestions.get(i).askQuestion();   // This asks the question, which includes all the follow up steps
	
	}
	
	catch(Exception e) 
	{
	System.out.println("You entered an invalid answer, invalid, not simply wrong");	
	invalidAnswerFlag = true;
	}
	
	}while(invalidAnswerFlag);  // This loop runs until they enter a valid answer anser number, even if it's wrong
	
	
	
	
	if(listOfQuestions.get(i).GetUserGaveCorrectAnswer()) { numberOfQuestionsAnsweredCorrectly++; }  // If they got it right, add one to their score

}

// This prints the final statement about their score
System.out.println("You got " + numberOfQuestionsAnsweredCorrectly + " answer(s) correct out of the total " + listOfQuestions.size() + " questions asked");
	
			
			
			

	
		
		

	
	
	


		
}	// This is the end of the Main method
	
	
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);

// I commented the below out, because it defeats the purpose of my exception handling		
		
//		if(inputFile.exists() == false) { // checks for the existence of a file
//			System.out.println(path+" does not exist");
//			System.exit(1); // Ends the program
//		} else if(inputFile.isFile() == false) {
//			System.out.println(path+" is not a file");
//			System.exit(1); // Ends the program
//		}
	
		return inputFile;
	}	
	
	
	
	
} // This is the end of the QuizMaker Class
