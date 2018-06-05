package com.techelevator;

public class Employee {

int employeeId;

String firstName = "FirstName";
String lastName = "LastName";
String fullName;
String department;
double annualSalary;

public Employee( int employeeId,  String firstName, String lastName, double annualSalary) {
	
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.annualSalary = annualSalary;
	
}

public void setLastName(String lastName) {
	
	this.lastName = lastName;
	
}

public void setDepartment(String department) {
	
	this.department = department;
}



public int getEmployeeId() {
	
	return this.employeeId;
}

public String getFirstName() {
	
	return this.firstName;
	
}

public String getLastName() {
	
	return this.lastName;
}

public String getDepartment() {
	
	
	return this.department;
}

public double getAnnualSalary() {
	
	return this.annualSalary;
}

public String getFullName() {
	
	
	System.out.println(this.fullName);
	makeFullName();
	System.out.println(this.fullName);
	
	return this.fullName;
	
}


public void raiseSalary(double percent) {

	this.annualSalary =this.annualSalary + this.annualSalary * percent / (double)100.00;
	
}


private void makeFullName() {
	
	this.fullName = this.lastName + ", " + this.firstName;
	
	
}



}
