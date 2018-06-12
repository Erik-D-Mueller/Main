package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

	public class FruitTreeTest {
		
		private FruitTree tree100;   //This creates the object from the class, so that we can test the object (which is really testing the class that it was created from)
			
		
		@Before   //This method is run before every single @Test, so it always resets it to pear, and 15
		public void setup() {
			
			tree100 = new FruitTree("pear", 15);  // FruitTree is the class, tree100 is the object made from it
			
		}
		
		
		@Test
	public void does_pick_fruit_return_the_correct_result() {
			
			Assert.assertTrue( "Can I pick 4 out of 15 pears? :", tree100.PickFruit(4));
			setup();
			Assert.assertFalse("Can I pick 20 out of 15 pears? ", tree100.PickFruit(20));
	
	}


	@Test
	public void test_constructor() {
		
		Assert.assertNotNull("The object tree100 does indeed exist: ", tree100);;   //This makes sure that the object is not null, which confirms that it was indeed actually created
		
		
	}
	

}
