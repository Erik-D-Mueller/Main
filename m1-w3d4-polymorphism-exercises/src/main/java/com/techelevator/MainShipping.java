package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Weight is accepted in pounds and ounces in MainShipping, but it is converted to
 * ounces which stays the defulat for the rest of the program.
 * 
 * In this scenario, an object of FedEx or UPS or PostalService sort of represents their quote, for how
 * much they would charge to ship that particular package with its weight, distance and class level required.
 * 
 */

public class MainShipping {

	public static void main(String[] args) {
		
		String inputedInfo;
		Double packageWeightString;
		Double packageDistance;
		String poundsOrOunces;
		BigDecimal packageWeightBD = new BigDecimal(0);
		double packageWeight;

		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Please enter the weight of the package: ");

		inputedInfo = keyboardInput.next();

		packageWeight = Double.parseDouble(inputedInfo);

		System.out.println("(P)ounds or (O)unces?");
		
		poundsOrOunces = keyboardInput.next();

		if (poundsOrOunces.contains("P")) { 					// If they indicated pounds, then we convert to ounces by multiplying by 16
		
			packageWeight *= 16.0;
		
		}

		System.out.println("Please enter the distance that the package will be traveling in miles: ");

		inputedInfo = ""; //Perhaps this sort of resets it?
		
		inputedInfo = keyboardInput.next();
		
		packageDistance = Double.parseDouble(inputedInfo);
		
		
		
		
		List<DeliveryDriver> deliveryQuotesList = new ArrayList<DeliveryDriver>();   // This creates a list of type DeliveryDriver, which we will put FedEx, UPS, and PostalService into because they're all "DeliveryDriver" types.

		
		
		
		DeliveryDriver PostalServiceQuoteClass1 = new PostalService(packageWeight, packageDistance, 1);  // Creates a shipping quote from PostalService for 1st class
		
		deliveryQuotesList.add(PostalServiceQuoteClass1);  //Add it to the list
		
		DeliveryDriver PostalServiceQuoteClass2 = new PostalService(packageWeight, packageDistance, 2);  // Creates a shipping quote from PostalService for 2nd class
		
		deliveryQuotesList.add(PostalServiceQuoteClass2); //Add it to the list
		
		DeliveryDriver PostalServiceQuoteClass3 = new PostalService(packageWeight, packageDistance, 3);  // Creates a shipping quote from PostalService for 3rd class
		
		deliveryQuotesList.add(PostalServiceQuoteClass3);  //Add it to the list
	
		DeliveryDriver fedExQuote = new FedEx(packageWeight, packageDistance);   // This is polymorphism.  The object is technically a FedEx object, but we are going to manipulate it as if it were a DeliveryDriver object, which it technically is, like a giraffe is a type of animal, could refer to it either way.
		
		deliveryQuotesList.add(fedExQuote);   // Add it to the list of quotes
	
		DeliveryDriver UPSQuoteClass3 = new UPS(packageWeight, packageDistance, 3);  // Creates a shipping quote from UPS for 3rd class
		
		deliveryQuotesList.add(UPSQuoteClass3);  //Add it to the list

		DeliveryDriver UPSQuoteClass2 = new UPS(packageWeight, packageDistance,2);  // Creates a shipping quote from UPS for 2nd class
		
		deliveryQuotesList.add(UPSQuoteClass2);  //Add it to the list
	
		DeliveryDriver UPSQuoteClass1 = new UPS(packageWeight, packageDistance,1);   // Creates a shipping quote from UPS for 1st class
		
		deliveryQuotesList.add(UPSQuoteClass1);  // Add it to the list
	
	// We now have our list of shipping price quotes!!!!!!!
		
		System.out.println();
		
		System.out.println("Delivery Method \t\t\t $ cost");
		System.out.println("------------------------------------------------");
		
		for(DeliveryDriver quote: deliveryQuotesList) {     //  the first part is what type we are pulling out, the second is the name we are temporarly assigning to it, the last part is the list that we are pulling from
			
			System.out.println( quote.nameOfQuote() + "\t\t" + quote.calculateRate()  );
			
			
		}
		
	
	}

	
}