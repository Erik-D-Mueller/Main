package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

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
		
		Double packageDistanceInMiles;
		int packageWeightInOunces;
		Scanner keyboardInput = new Scanner(System.in);
		
		
		// This prompts for and returns the weight in ounces
		packageWeightInOunces = getPackageWeight(keyboardInput);
		
		//This prompts for and returns the distance in miles
		packageDistanceInMiles = getPackageDistance(keyboardInput);
		
		//This prints all the quotes to the screen
		printQuotes(packageWeightInOunces, packageDistanceInMiles);	
	
	}

	
	private static int getPackageWeight(Scanner keyboardInput){
		
		String inputedInfo;
		double packageWeight;
		String poundsOrOunces;
		
		System.out.println("Please enter the weight of the package: ");

		inputedInfo = keyboardInput.next();

		packageWeight = Double.parseDouble(inputedInfo);

		System.out.println("(P)ounds or (O)unces?");
		
		poundsOrOunces = keyboardInput.next();

				if (poundsOrOunces.contains("P")) { // If they indicated pounds, then we convert to ounces by multiplying by 16	
						packageWeight *= 16.0;		
				}	
		return (int)packageWeight;		
	}
	
	
	private static double getPackageDistance(Scanner keyboardInput){
		String inputedInfo;
		System.out.println("Please enter the distance that the package will be traveling in miles: ");
		inputedInfo = keyboardInput.next();
		return Double.parseDouble(inputedInfo);
	}
	
	
	private static void printQuotes(int packageWeightInOunces, double packageDistanceInMiles){
		
		System.out.println("Delivery Method               $ Cost");
		System.out.println("-----------------------------------------");
		
	
// Make the Postal Service objects for first second and third class
		DeliveryDriver PostalServiceFirstClass = new PostalServiceFirstClass();
		DeliveryDriver PostalServiceSecondClass = new PostalServiceSecondClass();
		DeliveryDriver PostalServiceThirdClass = new PostalServiceThirdClass();
				
		// Call the calculateRate() and getName() methods on the postal service objects and display the results
		System.out.println(PostalServiceFirstClass.nameOfQuote() + PostalServiceFirstClass.calculateRate(packageWeightInOunces, packageDistanceInMiles));
		System.out.println(PostalServiceSecondClass.nameOfQuote() + PostalServiceSecondClass.calculateRate(packageWeightInOunces, packageDistanceInMiles));
		System.out.println(PostalServiceThirdClass.nameOfQuote() + PostalServiceThirdClass.calculateRate(packageWeightInOunces, packageDistanceInMiles));

		// Make the fedex Object
		DeliveryDriver FedEx = new FedEx();
				
		// Call the calculaterate() and getname() methods and display results
		System.out.println(FedEx.nameOfQuote() +  FedEx.calculateRate(packageWeightInOunces, packageDistanceInMiles));
						
		// Make the UPS Objects for first second and third class
		DeliveryDriver UPSFirstClass = new UPSFirstClass();
		DeliveryDriver UPSSecondClass = new UPSSecondClass();
		DeliveryDriver UPSThirdClass = new UPSThirdClass();
		
		// Call and display the UPS calculateRate and getName method on those objects
		System.out.println(UPSFirstClass.nameOfQuote() + UPSFirstClass.calculateRate(packageWeightInOunces, packageDistanceInMiles));
		System.out.println(UPSSecondClass.nameOfQuote() + UPSSecondClass.calculateRate(packageWeightInOunces, packageDistanceInMiles));
		System.out.println(UPSThirdClass.nameOfQuote() + UPSThirdClass.calculateRate(packageWeightInOunces, packageDistanceInMiles));
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}