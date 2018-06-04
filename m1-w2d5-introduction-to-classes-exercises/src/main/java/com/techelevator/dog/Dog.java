package com.techelevator.dog;

public class Dog {

	private boolean sleeping;   //true if sleep, false if awake
	
	public void sleep() {
		
		this.sleeping = true;
		
	}
	
	public void wakeUp() {
		 
		 this.sleeping = false;
	
	 }
	 
	 
	 public String makeSound() {
		
		 if(sleeping){ 		return "Zzzzz...";		}
		 return "Woof!"; 
	 
	 }
	 
	 public boolean isSleeping() {
		 
		 return this.sleeping;
		 
	 }

	
	
}
