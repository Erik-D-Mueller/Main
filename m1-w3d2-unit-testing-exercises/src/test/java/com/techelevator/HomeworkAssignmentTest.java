package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HomeworkAssignmentTest {

	private HomeworkAssignment biologyHomework = new HomeworkAssignment(100);   // This creates and instantiates the object that we're testing

	@Before
	public void setup() {   // This runs before each test and resets the values
		
		biologyHomework = new HomeworkAssignment(100);  //Sets possible marks to 100
		biologyHomework.setTotalMarks(90);  //Sets total marks to 90
		
	}
		
	
	@Test
	public void check_that_correct_letter_grade_is_returned() {
		
		Assert.assertEquals("A", biologyHomework.getLetterGrade());
		
		biologyHomework = new HomeworkAssignment(100);  //Sets possible marks to 100
		
		biologyHomework.setTotalMarks(70);
		
		Assert.assertEquals("C", biologyHomework.getLetterGrade());
		
	}
	
	
	@Test
	public void incorrect_value_given_for_total_marks() {
		
		
		biologyHomework.setTotalMarks(70);
		
		Assert.assertEquals("if given positive value, it should change total marks: ", 70, biologyHomework.getTotalMarks());
		
		biologyHomework.setTotalMarks(50);
		
		biologyHomework.setTotalMarks(-100);
		
		Assert.assertEquals("if given negative value, it should change total marks: ", 50, biologyHomework.getTotalMarks());
		
	
	}
	
	
}
