// This class only exists so that I can use polymorphism to stick all the different shipping quotes into an array

package com.techelevator;

public abstract class ShippingQuotes {

	
	public abstract Double calculateRate(int packageWeight, double packageDistance);
	public abstract String nameOfQuote();
	
}
