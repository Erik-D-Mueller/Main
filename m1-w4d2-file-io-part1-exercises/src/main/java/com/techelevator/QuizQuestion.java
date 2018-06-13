package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// This is a class for the quiz questions

public class QuizQuestion {

private String question;
private boolean userGaveCorrectAnswer = false;  // True if they gave the correct answer
private int correctAnswerIndexNumber=0;


ArrayList<String> answers=new ArrayList<String>();   // This array contains all the possible answers for the question and starts at zero, so answer1 is at position zero . . .


public void setQuestion(String question) {  //Setter to set the question
	
	this.question = question;
	
}


public void setUpAnswers(String answer) {   // This catches the answers one at a time and adds them to the answers array
	
	answers.add(answer);
	
}

public void askQuestion() {
	
	printQuestionAndAnswersToScreen();
	
	System.out.println();
	System.out.println("Your answer: ");
	
	
	Scanner userInput = new Scanner(System.in);   //This input is used to get the person's answer
	
	String theirAnswerString = userInput.nextLine();
	
	
	// "Does their answer match the "correct answer"?  its -1 because the indexing starts at zero for the answers.
	// Sets userGaveCorrectAnser to true, if they gave the correct answer
	
	
	
	
	
	if(Integer.parseInt(theirAnswerString) < 1  	|| 	Integer.parseInt(theirAnswerString) > answers.size() ) {   // If the answer number is outside the bounds
		
		System.out.println();
		System.out.println("Invalid Answer!");
		this.askQuestion();  						 // It recursively calls itself until it gets a valid, albeit possibly wrong answer.
	}
	
	
	
	
	
	// answers.get(Integer.parseInt(theirAnswerString)).contains(           )
	
			
	userGaveCorrectAnswer = ( 		Integer.parseInt(theirAnswerString) -1 == correctAnswerIndexNumber		);    //If they gave the correct answer, then set it to true
	
	if(userGaveCorrectAnswer) {			System.out.println("Correct!");		}
	else { 		

		System.out.println("Sorry, that isn't correct!"); 		
		}
	
}

public void printQuestionAndAnswersToScreen() {
	
// This prints the question	
	System.out.println();
	System.out.println(question + " ");

// This prints all the answers


for(int i = 0; i< answers.size(); i++) {

System.out.println( (i+1) + ". " + answers.get(i)+ " ");   // The answers index from zero

}
	

}

public boolean GetUserGaveCorrectAnswer() {
	
	return this.userGaveCorrectAnswer;
}

public void setCorrectAnswerIndexNumber(int correctAnswerIndexNumber){   // The correct answer number is found in the main, then set here
	
	this.correctAnswerIndexNumber = correctAnswerIndexNumber;
		
}


}
