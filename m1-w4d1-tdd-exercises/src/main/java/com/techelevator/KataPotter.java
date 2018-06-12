package com.techelevator;

public class KataPotter {

	
	/*
	 *  
	 *  If they buy 2 unique books: 5% discount on those two books
	 *  3 unique books, 10% discount on those 3
	 *  4 unique books, 20% discount on those 4
	 *  5 unique books, 25%	 discount on those 5
	 *  
	 */
		
	static int numberOfUniqueBooks=0;
	
	static int totalBooks=0;
	
	static double price = 0.0;
	
	
	public static double getCost(int[] books) {
	
			
		for(int i = 1; i <=5; i++) {    // This loop counts how many unique books are being purchased
		
			if(	books[i]>0	)   {	 numberOfUniqueBooks++;		}
			
		}
		
		
		for(int i = 1; i <=5; i++) {    // This loop counts how many total books are being purchased
			
			totalBooks += books[i];
			
		}
		
		
		if(numberOfUniqueBooks==5) {
			
			price = 5.0 * 8.0 * (0.75) + (totalBooks - numberOfUniqueBooks)*8.0;
	
		}
		
		
		if(numberOfUniqueBooks==4) {
			
			price = 5.0 * 8.0 * (0.75) + (totalBooks - numberOfUniqueBooks)*8.0;
	
		}
		
		
		if(numberOfUniqueBooks==3) {
	
			price = 5.0 * 8.0 * (0.75) + (totalBooks - numberOfUniqueBooks)*8.0;

		}
		
		
		if(numberOfUniqueBooks==2) {
	
			price = 5.0 * 8.0 * (0.75) + (totalBooks - numberOfUniqueBooks)*8.0;

		}
		
		
		if(numberOfUniqueBooks==1) {
			
			price = numberOfUniqueBooks*8.0;

		}
		
		System.out.println(price);
		
		return price;
		
		
	}
	
	
	
	
	
}
