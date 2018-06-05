package com.techelevator;

public class FruitTree {

String typeOfFruit;
int piecesOfFruitLeft;


public FruitTree(String typeOfFruit, int startingPiecesOfFruit)  {
	
	this.piecesOfFruitLeft = startingPiecesOfFruit;
	
	this.typeOfFruit = typeOfFruit;                    // Is this OK?  Or should I use a new statement?
	
	
}

public String getTypeOfFruit() {
	
	return this.typeOfFruit;
	
}


public int getPiecesOfFruitLeft() {
	
	return this.piecesOfFruitLeft;
	
}



public boolean pickFruit(int fruit) {
	
	if(fruit <= piecesOfFruitLeft) {  
		
	this.piecesOfFruitLeft-=fruit;
	return true;

	}
	
	return false;
	
}















}
