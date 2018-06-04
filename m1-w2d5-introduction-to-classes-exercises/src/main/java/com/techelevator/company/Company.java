package com.techelevator.company;

public class Company {
	
	
	


private String name;

private int numberOfEmployees;

private double revenue;

private double expenses;



public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}



public int getNumberOfEmployees() {
	return this.numberOfEmployees;
}

public void setNumberOfEmployees(int numberOfEmployees) {
	this.numberOfEmployees = numberOfEmployees;
}


public double getRevenue() {
	return this.revenue;
}



public void setRevenue(double revenue) {
	this.revenue = revenue;
}

public double getExpenses() {
	return this.expenses;
}



public void setExpenses(double expenses) {
	this.expenses = expenses;
}

public String getCompanySize() {
	
	if(this.numberOfEmployees < 51) {		return "Small";		}
	if(this.numberOfEmployees > 250){		return "Large";		}
	else 							{ 		return "Medium";	}

}

public double getProfit() {
	return this.revenue - this.expenses;
	}
	

	
}
