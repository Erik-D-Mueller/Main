package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TollApplication {

	public static void main(String[] args) {
		
		Double sumMiles = 0.0;
		Double totalRevenue = 0.0;
				
		List<Vehicle> vehicleList1 = new ArrayList<Vehicle>();
		
		for(int x=0; x<5; x++) {
		vehicleList1.add(new Car(true));           // Here I am adding all of the "Vehicles types" to the list vehicleList1
		}
		
		vehicleList1.add(new Truck(4));
		vehicleList1.add(new Truck(6));    
		vehicleList1.add(new Truck(15));    
		
		System.out.println("Vehicle \t Distance Travelled \t Toll $");
		System.out.println("------------------------------------------------------------");
	
		double randomDistance;
		
		for(Vehicle veh: vehicleList1) {
			
			randomDistance = Math.random() * 230.0 + 10;   // Calculate a random distance for the vehicle
			
			sumMiles += randomDistance;   //Add to the total distance travelled
			
			totalRevenue += veh.calculateToll(randomDistance) ;     //Add to the total revenue collected
			
			System.out.println(veh.getTypeOfVehicle() + "\t\t" + randomDistance + "\t" + veh.calculateToll(randomDistance));
			
		}
		
		System.out.println();
		System.out.println("The sum of all miles travelled is: " + "\t" + sumMiles);
		System.out.println("The total revenue collected is: " + "\t" + totalRevenue);
		
	}

}
