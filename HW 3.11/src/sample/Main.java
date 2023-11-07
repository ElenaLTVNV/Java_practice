package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        // Define building parameters
		        int floorsPerEntrance = 9;
		        int apartmentsPerFloor = 4;
		        int entrances = 5;
		        
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the apartment number: ");
		        int apartmentNumber = sc.nextInt();

		        // Calculate entrance and floor
		        int entranceNumber = (apartmentNumber - 1) / (floorsPerEntrance * apartmentsPerFloor) + 1;
		        int floorInEntrance = ((apartmentNumber - 1) / apartmentsPerFloor) % floorsPerEntrance + 1;

		        if (entranceNumber <= entrances && apartmentNumber > 0) {
		            System.out.println("The apartment " + apartmentNumber + " is in entrance " + entranceNumber +
		                    " on floor " + floorInEntrance + ".");
		        } else {
		            System.out.println("This apartment does not exist in the building.");
		        }

		        sc.close();
		    }
		}

		        
		          





	


