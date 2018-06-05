package com.techelevator;

public class HomeworkAssignment {

private int totalMarks = 0;
private int possibleMarks = 0;
private String submitterName;
private String letterGrade;

public HomeworkAssignment(int possibleMarks) {   // Are constructors supposed to be public or private or does it matter?
	 
	this.possibleMarks = possibleMarks;
	
	
}




public int getTotalMarks() {
	
	return this.totalMarks;
}


public int getPossibleMarks() {
	
	return this.possibleMarks;
}


public void setTotalMarks(int totalMarks) {
	
	this.totalMarks = totalMarks;
	
	}

public String getSubmitterName() {
	
	return this.submitterName;
	
}

public void setSubmitterName(String submitterName) {
	
	
	this.submitterName = submitterName;
}

public String getLetterGrade() {

	calculateLetterGrade();
	
	
	
	return this.letterGrade;
	
}

private void calculateLetterGrade() {
	
	double num = ((double)this.totalMarks / (double)this.possibleMarks) ;
	
	System.out.println(num);
	
	System.out.println("Grade of " + this.letterGrade);
	
	System.out.println( this.totalMarks + " / " + this.possibleMarks);
	
	while(true) {   //making a loop allows me to use "break"
		
	if( num >= 0.9) { this.letterGrade = "A"; break; }
	if( num >= 0.8) { this.letterGrade = "B"; break; }
	if( num >= 0.7) { this.letterGrade = "C"; break; }    //Should I use a return, or just set it directly like I have?
	if(num >= 0.6)  { this.letterGrade = "D"; break; }
	else { this.letterGrade = "F"; break; }
 
	}

}

}



