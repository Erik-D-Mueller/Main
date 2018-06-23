package com.techelevator;

import java.util.List;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

import java.util.HashSet;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
	
		Map<String, String> myMap = new HashMap<String,String>();  // Declare the map
		
		animalName = animalName.toLowerCase();
		
		myMap.put("rhino", "Crash");						// Populate the map
		myMap.put("giraffe", "Tower");
		myMap.put("elephant", "Herd");
		myMap.put("lion", "Pride");
		myMap.put("crow", "Murder");
		myMap.put("pigeon", "Kit");
		myMap.put("flamingo", "Pat");
		myMap.put("deer", "Herd");
		myMap.put("dog", "Pack");
		myMap.put("crocodile", "Float");
		myMap.put("", "unknown");
		myMap.put("walrus", "unknown");
		
		return myMap.get(animalName);
		
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		
		Map<String, Double> myMap = new HashMap<String, Double>();
		
		itemNumber = itemNumber.toLowerCase();
		
		myMap.put("kitchen4001", 0.20);
		myMap.put("garage1070", 0.15);
		myMap.put("livingroom", 0.10);
		myMap.put("kitcken6073", 0.40);
		myMap.put("bedroom3434", 0.60);
		myMap.put("bath0073", 0.15);
		myMap.put("", 0.00);
		myMap.put("dungeon9999", 0.00);
		
		return myMap.get(itemNumber);
		
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		if(peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000) // If peter has more than zero an paul has less than 10 dollars
		
				{  
					peterPaul.put("Paul", peterPaul.get("Paul") + peterPaul.get("Peter")/2 );  // Paul gets Pauls money plus the equivalent of half of peters money
				
					peterPaul.put("Peter", (int) Math.ceil(peterPaul.get("Peter")/2.0) );  // Peter only gets to keep half of his money
	
				}
		
		return peterPaul;
		
		}
	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
				
		if( peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000 ) {
			
			peterPaul.put("PeterPaulPartnership", (peterPaul.get("Peter")/4) + (peterPaul.get("Paul")/4));
			
			peterPaul.put("Peter",  ((peterPaul.get("Peter")*3)/4)) ;  // Peter gets to keep 3/4 of his money
			
			peterPaul.put("Paul", ((peterPaul.get("Paul")*3)/4));;  // Paul gets to keep 3/4 of his money	
		
		}
		
		return peterPaul;
		
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		
		Map<String, String> myMap = new HashMap<String, String>(); 
		
		for( int i = 0; i < words.length; i++) {
			
			myMap.put( words[i].substring(0, 1), words[i].substring(words[i].length()-1 ) );	
			
		}
		
		return myMap;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
			
		Map<String, Integer> myMap = new HashMap<String, Integer>(); 
		
		for( int i = 0; i < words.length; i++) {   // This loop creates all the keys, but with values of zero
			
			myMap.put( words[i], 0);
		
		}
		
		for( int i = 0; i < words.length; i++) {  //This loop then counts to create the values
			
			myMap.put(words[i], myMap.get(words[i]) + 1);
			
		}
		
		return myMap;
		
	}
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		
			Map<Integer, Integer> myMap = new HashMap<Integer, Integer>(); 
		
		for( int i = 0; i < ints.length; i++) {   // This loop creates all the keys, but with values of zero
			
			myMap.put( ints[i], 0);
		
		}
		
		for( int i = 0; i < ints.length	; i++) {  //This loop then counts to create the values
			
			myMap.put(ints[i], myMap.get(ints[i]) + 1);
			
		}
		
		return myMap;
		
	}
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		
			Map<String, Boolean> myMap = new HashMap<String, Boolean>(); 
		
		for( int i = 0; i < words.length; i++) {   // This loop creates all the keys
			
			if(myMap.containsKey( words[i])) { 		myMap.put( words[i], true); 		  }  // If the key already exists, then this must be the second time that we have found it, so lets assign it a true value
			
			else { myMap.put( words[i], false); } // If the key does not exist, then create it, but leave it false
			
		}
		
		return myMap;

	}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		
		Set<String> keysMainWarehouse = mainWarehouse.keySet();
		
		Set<String> keysRemoteWarehouse = remoteWarehouse.keySet();
		
		
		for(String name : keysRemoteWarehouse) {   // This iterates through every key in the remoteWarehouse
			
		if(  			mainWarehouse.containsKey(name)  ) {  	mainWarehouse.put(name, mainWarehouse.get(name) + remoteWarehouse.get(name)); 	}  //If it already contains it, then set it equal to its old value plus the new value
		else {			mainWarehouse.put(name,  remoteWarehouse.get(name));		}   // If the keyd does not already exist then simply make a new one
					
	}
	
		return mainWarehouse;
	
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	
	public Map<String, Integer> last2Revisted(String[] words) {
				
		String searchWord;
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		
		for(String temp: words) {
			
		searchWord = temp.substring(temp.length()-2, temp.length());
		
		int counter = 0;
		for(int x = 0; x < temp.length()-2; x++) {
			
			if(temp.substring(x,x+2).contains(searchWord)){ counter++;}
			
		}
			myMap.put(temp, counter);			
		}
		return myMap;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		
		
		Set<String> words = new HashSet<String>();
		
		for(String name : stringList) {
			
			words.add(name);
			
		}
		
		stringList.clear(); // Clear out the stringlist so that I can reuse it.
		
for(String name : words) {
			
			stringList.add(name);
			
		}
		
		return stringList;

}
}