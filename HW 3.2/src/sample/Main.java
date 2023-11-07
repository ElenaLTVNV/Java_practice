package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	

	int floor = 9;
	int apartmentOnFloor = 4;
	int entrance = 5;
	int entrance1Apartments;
	int allApartments;

	
	System.out.println(entrance1Apartments = floor * apartmentOnFloor);
	
	System.out.println(allApartments = entrance1Apartments * entrance);

	
	System.out.println("Enter apartment what you need");
	int apartment = sc.nextInt();
	
	int entranceNumber = (apartment - 1) / entrance1Apartments +1;
	int floorInEntrance = ((apartment - 1) / apartmentOnFloor) % floor +1;
	
	
	if (apartment>180 || apartment<1) {
		 System.out.println("No existing apartment");
		}
		else {System.out.println(" The appartment " + apartment + " Entrance located "+ entranceNumber + " on " + floorInEntrance + " floor ");}
	 
	 sc.close();
		}
	}

