package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {

	
	/* 
	 * Position 1-5 on the array represents books 1 through 5.
	 * The numbers in those positions represent how many of that particular book to purchase.
	 */
	
	
	KataPotter someBooks = new KataPotter();
	
	@Test
	public void testGetCost() {
		
		// I like to make the index match the book number, so zero is zero.
		
		KataPotter someBooks = new KataPotter();
		
		int books[] = {0,2,2,2,1,1};
		
		Assert.assertEquals(54.0,  KataPotter.getCost(books));

}


}
