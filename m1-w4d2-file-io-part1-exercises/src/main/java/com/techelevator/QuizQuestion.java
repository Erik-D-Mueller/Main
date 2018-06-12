package com.techelevator;

import java.util.ArrayList;

// This is a class for the quiz questions

public class QuizQuestion {

private String question;
private String answer1;
private String answer2;
private String answer3;
private String answer4;
private String answer5;
int correctAnswerNumber;

ArrayList<String> answers=new ArrayList<String>();


public void setQuestion(String question) {
	
	this.question = question;
	
}


public void setCorrectAnswerNumber(int correctAnswerIndex) {
	
	this.correctAnswerNumber = correctAnswerIndex;

	
}


public void setUpAnswers(String answer) {   // This catches the answers one at a time and adds them to the answers array
	
answers.add(answer);
	
}

public void printEverythingToScreen() {
	
// This prints the question	
System.out.println(question + " ");


// This prints all the answers
for(int i = 0; i< answers.size(); i++) {
System.out.print(answers.get(i));
}
	
	
}






}




